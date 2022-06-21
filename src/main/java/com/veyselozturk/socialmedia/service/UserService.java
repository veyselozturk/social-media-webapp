package com.veyselozturk.socialmedia.service;

import com.veyselozturk.socialmedia.entity.User;
import com.veyselozturk.socialmedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public void save(User user) {
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
