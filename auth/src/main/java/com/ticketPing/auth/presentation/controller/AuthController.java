package com.ticketPing.auth.presentation.controller;

import com.ticketPing.auth.presentation.request.LoginRequest;
import com.ticketPing.auth.application.dto.LoginResponse;
import com.ticketPing.auth.application.service.AuthService;
import com.ticketPing.auth.presentation.cases.AuthSuccessCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import common.response.CommonResponse;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<CommonResponse<LoginResponse>> login(@RequestBody final LoginRequest loginRequest) {
        LoginResponse loginResponse = authService.login(loginRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CommonResponse.success(AuthSuccessCase.SUCCESS_LOGIN, loginResponse));
    }

    @GetMapping("/verify")
    public ResponseEntity<CommonResponse<Object>> verifyUser(@RequestParam(value = "userId") final UUID userId) {
        authService.verifyUser(userId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.success(AuthSuccessCase.USER_EXISTS));
    }

}
