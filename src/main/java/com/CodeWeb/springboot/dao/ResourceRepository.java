package com.CodeWeb.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CodeWeb.springboot.entity.Resource;

import java.util.List;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

    List<Resource> findAllByOrderBySubjectAsc();

    List<Resource> findBySubject(String username);
	
}
