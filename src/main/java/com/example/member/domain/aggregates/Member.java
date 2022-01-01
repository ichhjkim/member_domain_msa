package com.example.member.domain.aggregates;

import com.example.member.common.EntityDate;
import com.example.member.controller.dto.CreateMemberRequest;
import com.example.member.domain.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@Entity(name = "member")
public class Member extends EntityDate {

    @Id @GeneratedValue
    private Long memberId;

    @Column(nullable = false, unique = true)
    private String loginId;
    @Column(nullable = false)
    private String password;

    @Embedded
    private Address address;

    public void createMember() {

    }
}
