package com.CodeWeb.springboot.service;

import com.CodeWeb.springboot.entity.Member;
import com.CodeWeb.springboot.entity.MemberForm;

import java.util.Optional;


public interface MembersService {

    Optional<Member> findByUserId(String username);

    void save(MemberForm theMember);

}
