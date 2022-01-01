package com.example.member.common;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResultResponse<T> {
    private ResultCode resultCode;
    private T data;
    private String message;
}
