package com.CodeWeb.springboot.service;

import com.CodeWeb.springboot.entity.MemberForm;
import com.CodeWeb.springboot.entity.Role;

import java.util.Optional;

public interface RolesService {
    Optional<Role> findByUserId(String username);

    void saveRole(MemberForm theMember);

    void saveManager(MemberForm theMember);
}
