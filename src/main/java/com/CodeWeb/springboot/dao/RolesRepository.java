package com.CodeWeb.springboot.dao;

import com.CodeWeb.springboot.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Role, String> {

    Optional<Role> findByUserId(String username);

}
