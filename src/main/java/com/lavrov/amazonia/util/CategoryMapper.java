package com.lavrov.amazonia.util;

import com.lavrov.amazonia.category.Category;
import com.lavrov.amazonia.category.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toEntity(CategoryDTO categoryDTO);
    CategoryDTO toDTO(Category category);
}
