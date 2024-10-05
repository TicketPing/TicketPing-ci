package com.ticketPing.order.presentation.response.exception;


import cases.ErrorCase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum PerformanceExceptionCase implements ErrorCase {

    PERFORMANCE_NOT_FOUND(HttpStatus.NOT_FOUND, "공연을 찾을 수 없습니다."),
    PERFORMANCE_HALL_NOT_FOUND(HttpStatus.NOT_FOUND, "공연장을 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
