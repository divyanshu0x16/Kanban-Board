package com.divyanshu.kanban_task_management.helper;

public class SampleRequestBody {

    public static final String USER_BODY = """
            {
                "name": "John Doe",
                "email": "johndoe@example.com",
                "boards": [
                    {
                        "name": "Project Alpha",
                        "columns": [
                            {
                                "name": "To Do",
                                "tasks": [
                                    {
                                        "title": "Task 1",
                                        "description": "Description for Task 1",
                                        "status": "To Do",
                                        "subtasks": [
                                            {
                                                "name": "Subtask 1",
                                                "completed": false
                                            },
                                            {
                                                "name": "Subtask 2",
                                                "completed": true
                                            }
                                        ]
                                    }
                                ]
                            },
                            {
                                "name": "In Progress",
                                "tasks": []
                            },
                            {
                                "name": "Done",
                                "tasks": []
                            }
                        ]
                    },
                    {
                        "name": "Project Beta",
                        "columns": []
                    }
                ]
            }""";
}
