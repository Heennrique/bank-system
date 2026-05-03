package com.henriquesnts.bank_system.dto;

import lombok.Data;


@Data
public class UserRequestDto {

    private String name;
    private String email;
    private String password;
    private String cpf;
}
