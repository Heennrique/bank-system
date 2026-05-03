package com.henriquesnts.bank_system.mapper;

import com.henriquesnts.bank_system.dto.AccountRequestDto;
import com.henriquesnts.bank_system.dto.AccountResponseDto;
import com.henriquesnts.bank_system.dto.UserRequestDto;
import com.henriquesnts.bank_system.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "accountNumber", target = "accountNumber")
    AccountResponseDto toResponse(Account model);

    List<AccountResponseDto> toListAccountResponseDto(List<Account>list);
}
