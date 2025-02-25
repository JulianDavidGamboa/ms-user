package com.vetapp.msuser.application.usecase;

import org.springframework.stereotype.Service;

import com.vetapp.msuser.domain.model.User;
import com.vetapp.msuser.domain.repository.IUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final IUserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

}
