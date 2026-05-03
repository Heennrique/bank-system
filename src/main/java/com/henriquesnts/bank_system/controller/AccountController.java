package com.henriquesnts.bank_system.controller;


import com.henriquesnts.bank_system.dto.AccountRequestDto;
import com.henriquesnts.bank_system.dto.AccountResponseDto;
import com.henriquesnts.bank_system.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<String> toRegister(@RequestBody AccountRequestDto dto){
            accountService.saveAccount(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario cadastrado com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<AccountResponseDto>> listAll(){return ResponseEntity.ok(accountService.shareAllAccounts());}

}
