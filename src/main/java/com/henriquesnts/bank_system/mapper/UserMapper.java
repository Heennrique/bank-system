package com.henriquesnts.bank_system.mapper;

import com.henriquesnts.bank_system.dto.UserRequestDto;
import com.henriquesnts.bank_system.dto.UserResponseDto;
import com.henriquesnts.bank_system.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id",ignore = true)
    User toUserModel (UserRequestDto dto);

    UserResponseDto toResponse(User model);

    List<UserResponseDto> toListUserResponseDto(List<User>list);

}
