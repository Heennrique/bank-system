package com.henriquesnts.bank_system.dto;

public record AccountRequestDto (

        int agency,
        int accountNumber,
        String userId
){}
