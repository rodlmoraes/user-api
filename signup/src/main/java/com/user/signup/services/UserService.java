package com.user.signup.services;

import com.user.signup.entities.User;
import com.user.signup.enums.Status;
import com.user.signup.repositories.UserRepository;
import com.user.signup.requests.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User create(CreateUserRequest createUserRequest) {
        User user = User.builder()
                .email(createUserRequest.getEmail())
                .name(createUserRequest.getName())
                .status(Status.RECEIVED)
                .build();

        User savedUser = userRepository.save(user);

        return savedUser;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
