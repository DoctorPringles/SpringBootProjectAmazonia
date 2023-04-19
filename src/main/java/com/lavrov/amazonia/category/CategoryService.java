package com.lavrov.amazonia.category;

import com.lavrov.amazonia.util.exceptions.EmptyFieldException;

import java.util.List;

public interface CategoryService {
    CategoryDTO saveCategory(CategoryDTO categoryDTO) throws EmptyFieldException;
    void deleteCategory(Integer id) throws EmptyFieldException;
    CategoryDTO findById(Integer id) throws EmptyFieldException;
    List<CategoryDTO> findAll();
}
