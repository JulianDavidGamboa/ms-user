package com.vetapp.msuser.infrastructure.adapter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetapp.msuser.application.usecase.CreateUserUseCase;
import com.vetapp.msuser.domain.model.User;
import com.vetapp.msuser.infrastructure.utils.ResponseUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {


    private final CreateUserUseCase createUserUseCase;

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody User user) {
        log.info("User ", user.getEmail());
        return ResponseUtil.success("User created", createUserUseCase.create(user));
    }

}
