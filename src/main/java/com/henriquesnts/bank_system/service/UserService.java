package com.henriquesnts.bank_system.service;

import com.henriquesnts.bank_system.dto.UserRequestDto;
import com.henriquesnts.bank_system.dto.UserResponseDto;
import com.henriquesnts.bank_system.mapper.UserMapper;
import com.henriquesnts.bank_system.model.User;
import com.henriquesnts.bank_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public UserResponseDto saveUser (UserRequestDto requestDto){

        return mapper.toResponse(repository.save(mapper.toUserModel(requestDto)));
    }
    public List<UserResponseDto> shareAllUser(){
        return mapper.toListUserResponseDto(repository.findAll());

    }

    public UserResponseDto shareToId(String id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return mapper.toResponse(user);
    }

}
