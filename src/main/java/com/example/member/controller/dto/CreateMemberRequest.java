package com.example.member.controller.dto;

import javax.validation.constraints.NotEmpty;

public class CreateMemberRequest {
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
}
