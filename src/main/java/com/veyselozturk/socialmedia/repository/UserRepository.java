package com.veyselozturk.socialmedia.repository;

import com.veyselozturk.socialmedia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
