package com.example.member.controller;

import com.example.member.controller.dto.CreateMemberRequest;
import com.example.member.controller.dto.CreateMemberResponse;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/api/v1/member")
    public ResponseEntity<String> saveMember(@RequestBody @Valid CreateMemberRequest createMemberRequest) {
        memberService.join(createMemberRequest);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
