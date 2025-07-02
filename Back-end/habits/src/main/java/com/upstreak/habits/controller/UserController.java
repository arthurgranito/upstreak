package com.upstreak.habits.controller;

import com.upstreak.habits.DTOs.UserDTO;
import com.upstreak.habits.exceptions.UserNotFoundException;
import com.upstreak.habits.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> users = service.findAll();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        Optional<UserDTO> user = service.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            throw new UserNotFoundException("User not found!");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        Optional<UserDTO> user = service.findById(id);
        if (user.isPresent()) {
            UserDTO savedUser = service.updateById(id, userDTO);
            return ResponseEntity.ok().body(savedUser);
        } else {
            throw new UserNotFoundException("User not found!");
        }
    }


}
