package com.henriquesnts.bank_system.dto;

import lombok.Data;

@Data
public class UserRequestDto {

    private String nome;
    private String email;
    private String password;
}
