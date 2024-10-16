package com.ticketPing.user.presentation.controller;

import com.ticketPing.user.application.service.UserService;
import com.ticketPing.user.presentation.status.UserSuccessCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ticketPing.user.application.dto.request.CreateUserRequest;
import common.response.CommonResponse;
import response.UserResponse;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<CommonResponse<UserResponse>> createUser(@RequestBody @Valid CreateUserRequest request) {
        UserResponse userResponse = userService.createUser(request);
        return ResponseEntity
                .status(201)
                .body(CommonResponse.success(UserSuccessCase.SUCCESS_CREATE_USER, userResponse));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<CommonResponse<UserResponse>> getUser(@RequestParam("userId") UUID userId) {
        UserResponse userResponse = userService.getUser(userId);
        return ResponseEntity
                .status(200)
                .body(CommonResponse.success(UserSuccessCase.SUCCESS_GET_USER, userResponse));
    }
}
