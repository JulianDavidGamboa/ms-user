package com.vetapp.msuser.infrastructure.adapter.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vetapp.msuser.infrastructure.adapter.entity.UserEntity;

@Repository
public interface IJpaUserRepository extends JpaRepository<UserEntity, UUID> {

}
