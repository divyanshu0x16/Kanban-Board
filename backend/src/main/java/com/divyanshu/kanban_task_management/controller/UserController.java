package com.divyanshu.kanban_task_management.controller;

import com.divyanshu.kanban_task_management.helper.SampleRequestBody;
import com.divyanshu.kanban_task_management.model.User;
import com.divyanshu.kanban_task_management.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Validated
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Valid user found", content = @Content),
        @ApiResponse(responseCode = "404", description = "No user with such id exists",
            content = @Content) })
    public ResponseEntity<User> getUserById(@PathVariable String id){
        Optional<User> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @io.swagger.v3.oas.annotations.parameters.RequestBody(
        content = @Content(
            schema = @Schema(implementation = User.class),
                examples = {
                    @ExampleObject(
                        name = "User schema sample",
                        value = SampleRequestBody.USER_BODY
                        )
    }))
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User successfully created", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request body",
                    content = @Content) })
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
