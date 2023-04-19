package com.lavrov.amazonia.review;


import com.lavrov.amazonia.product.ProductDTO;
import com.lavrov.amazonia.product.ProductService;
import com.lavrov.amazonia.util.Constants;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ReviewController implements Constants {
    private ProductService productService;
    public ReviewController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<ProductDTO>> findAll(){
        return new ResponseEntity<>(this.productService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/findById")
    public ResponseEntity<ProductDTO> findById(@RequestParam Integer id){
        try {
            return new ResponseEntity<>(this.productService.findById(id),HttpStatus.OK);
        } catch (EmptyFieldException e) {
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
    @PostMapping("/saveProduct")
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO){
        try {
            return new ResponseEntity<>(this.productService.saveProduct(productDTO), HttpStatus.CREATED);
        } catch (EmptyFieldException e) {
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
    @PostMapping("/deleteProduct")
    public ResponseEntity deleteCategory(@RequestParam Integer id){
        try {
            this.productService.deleteProduct(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (EmptyFieldException e){
            return Constants.EMPTY_FIELD_RESPONSE_ENTITY;
        }
    }
}
