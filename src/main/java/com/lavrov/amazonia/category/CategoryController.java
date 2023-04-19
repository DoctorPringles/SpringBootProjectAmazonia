package com.lavrov.amazonia.category;

import com.lavrov.amazonia.util.Constants;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/categories")
@RestController
public class CategoryController implements Constants {
    private CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<CategoryDTO>> findAll(){
        return new ResponseEntity<>(this.categoryService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/findById")
    public ResponseEntity<CategoryDTO> findById(@RequestParam Integer id){
        try {
            return new ResponseEntity<>(this.categoryService.findById(id),HttpStatus.OK);
        } catch (EmptyFieldException e) {
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
    @PostMapping("/saveCategory")
    public ResponseEntity<CategoryDTO> saveCategory(@RequestBody CategoryDTO categoryDTO){
        try {
            return new ResponseEntity<>(this.categoryService.saveCategory(categoryDTO), HttpStatus.CREATED);

        }catch (EmptyFieldException e){
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }

    }
    @PostMapping("/deleteCategory")
    public ResponseEntity deleteCategory(@RequestParam Integer id){
        try {
            categoryService.deleteCategory(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (EmptyFieldException e){
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
}
