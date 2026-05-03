package com.henriquesnts.bank_system.controller;

import com.henriquesnts.bank_system.dto.UserRequestDto;
import com.henriquesnts.bank_system.dto.UserResponseDto;
import com.henriquesnts.bank_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody UserRequestDto dto) {
        userService.saveUser(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> listAll() {
        return ResponseEntity.ok(userService.shareAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> shareID(@PathVariable String id) {
        return ResponseEntity.ok(userService.shareToId(id));
    }
}