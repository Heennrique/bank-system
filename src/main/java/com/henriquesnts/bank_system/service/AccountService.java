package com.henriquesnts.bank_system.service;

import com.henriquesnts.bank_system.dto.AccountRequestDto;
import com.henriquesnts.bank_system.dto.AccountResponseDto;
import com.henriquesnts.bank_system.mapper.AccountMapper;
import com.henriquesnts.bank_system.model.Account;
import com.henriquesnts.bank_system.model.User;
import com.henriquesnts.bank_system.repository.AccountRepository;
import com.henriquesnts.bank_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository repository;
    private final AccountMapper mapper;
    private final UserRepository userRepository;

    public String saveAccount(AccountRequestDto dto){
        User owner = userRepository.findById(dto.userId()).orElseThrow(() -> new RuntimeException("Usuário não Cadastado"));

        Account account = new Account();
        account.setAgency(dto.agency());
        account.setAccountNumber(dto.accountNumber());
        account.setUser(owner);
        repository.save(account);

        return "Conta criada com sucesso" + owner.getName();
    }

    public List<AccountResponseDto> shareAllAccounts(){
        return mapper.toListAccountResponseDto(repository.findAll());

    }

}
