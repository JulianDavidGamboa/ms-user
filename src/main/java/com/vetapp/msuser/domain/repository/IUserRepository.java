package com.vetapp.msuser.domain.repository;

import java.util.Optional;

import com.vetapp.msuser.domain.model.User;

public interface IUserRepository {
    User save(User user);
    Optional<User> findByEmail(String email);
}
