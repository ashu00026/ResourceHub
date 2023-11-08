package com.CodeWeb.springboot.dao;

import com.CodeWeb.springboot.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembersRepository extends JpaRepository<Member, String> {


    Optional<Member> findByUserId(String username);
}
