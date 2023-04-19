package com.lavrov.amazonia.product;

import com.lavrov.amazonia.product.ProductDTO;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;

import java.util.List;

public interface ProductService {
    ProductDTO saveProduct(ProductDTO orderDTO) throws EmptyFieldException;
    void deleteProduct(Integer id) throws EmptyFieldException;
    ProductDTO findById(Integer id) throws EmptyFieldException;
    List<ProductDTO> findAll();
}
