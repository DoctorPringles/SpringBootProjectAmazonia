package com.lavrov.amazonia.category.impl;

import com.lavrov.amazonia.category.CategoryDTO;
import com.lavrov.amazonia.category.CategoryRepository;
import com.lavrov.amazonia.category.CategoryService;
import com.lavrov.amazonia.category.CategoryValidator;
import com.lavrov.amazonia.util.CategoryMapper;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;
    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper=categoryMapper;
    }
    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) throws EmptyFieldException {
            CategoryValidator.validateCategory(categoryMapper.toEntity(categoryDTO));
            this.categoryRepository.save(categoryMapper.toEntity(categoryDTO));
            return categoryDTO;
    }

    @Override
    public void deleteCategory(Integer id) throws EmptyFieldException{
        Validator.validateInteger(id);
        this.categoryRepository.deleteById(id);
    }

    @Override
    public CategoryDTO findById(Integer id) throws EmptyFieldException {
        Validator.validateInteger(id);
        return this.categoryMapper.toDTO(this.categoryRepository.findById(id).orElse(null));
    }

    @Override
    public List<CategoryDTO> findAll() {
        return this.categoryRepository.findAll().stream().map(this.categoryMapper::toDTO).collect(Collectors.toList());
    }
}
