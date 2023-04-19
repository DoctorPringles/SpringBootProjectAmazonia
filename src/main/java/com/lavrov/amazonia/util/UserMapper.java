package com.lavrov.amazonia.util;

import com.lavrov.amazonia.user.User;
import com.lavrov.amazonia.user.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO reviewDTO);
    UserDTO toDTO(User review);
}
