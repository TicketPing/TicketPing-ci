package com.ticketPing.client_channel.presentation.cases;

import common.cases.ErrorCase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ClientErrorCase implements ErrorCase {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND ,"대기열에 존재하지 않는 사용자입니다.");

    private final HttpStatus httpStatus;
    private final String message;

}

