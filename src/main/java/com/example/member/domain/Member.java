package com.example.member.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter @Setter
@Entity(name = "member")
public class Member {

    @Id @GeneratedValue
    private Long memberId;

    @Column(nullable = false, unique = true)
    private String loginId;
    @Column(nullable = false)
    private String password;

}
