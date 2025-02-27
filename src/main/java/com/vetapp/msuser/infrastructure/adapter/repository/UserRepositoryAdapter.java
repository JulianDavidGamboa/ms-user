package com.vetapp.msuser.infrastructure.adapter.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vetapp.msuser.domain.exception.UserAlreadyExistsException;
import com.vetapp.msuser.domain.model.User;
import com.vetapp.msuser.domain.repository.IUserRepository;
import com.vetapp.msuser.infrastructure.adapter.entity.UserEntity;
import com.vetapp.msuser.infrastructure.adapter.mapper.IUserMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryAdapter implements IUserRepository {
    
    private final IJpaUserRepository jpaUserRepository;
    private final IUserMapper userMapper;

    @Override
    public User save(User user) {
        log.info("Creating user: {}", user);

        UserEntity userToMapper = userMapper.toEntity(user);
        log.info("Entity: {}", userToMapper);

        UserEntity savedUser = jpaUserRepository.save(userToMapper);
        log.info("Saved user: {}", savedUser);

        User userResponse = userMapper.toUser(savedUser);
        log.info("user response", userResponse);

        return userResponse;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaUserRepository.findByEmail(email).map(userMapper::toUser);
    }

}
