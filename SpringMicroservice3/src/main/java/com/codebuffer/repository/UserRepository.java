package com.codebuffer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebuffer.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
