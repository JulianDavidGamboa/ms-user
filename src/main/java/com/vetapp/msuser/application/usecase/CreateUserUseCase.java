package com.vetapp.msuser.application.usecase;

import org.springframework.stereotype.Service;

import com.vetapp.msuser.domain.exception.UserAlreadyExistsException;
import com.vetapp.msuser.domain.model.User;
import com.vetapp.msuser.domain.repository.IUserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateUserUseCase {

    private final IUserRepository userRepository;

    public User create(User user) {
        log.info("Validating email", user);
        userRepository.findByEmail(user.getEmail()).ifPresent(existingUser -> { throw new UserAlreadyExistsException("User already exists"); });;

        return userRepository.save(user);
    }

}
