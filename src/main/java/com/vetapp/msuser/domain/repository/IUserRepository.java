package com.vetapp.msuser.domain.repository;

import com.vetapp.msuser.domain.model.User;

public interface IUserRepository {
    User save(User user);
}
