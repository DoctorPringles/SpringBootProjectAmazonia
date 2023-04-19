package com.lavrov.amazonia.user;

import com.lavrov.amazonia.user.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO orderDTO);
    void deleteUser(Integer id);
    UserDTO findById(Integer id);
    List<UserDTO> findAll();
}
