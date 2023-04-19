package com.lavrov.amazonia.user.impl;

import com.lavrov.amazonia.product.ProductDTO;
import com.lavrov.amazonia.product.ProductRepository;
import com.lavrov.amazonia.product.ProductService;
import com.lavrov.amazonia.product.ProductValidator;
import com.lavrov.amazonia.util.ProductMapper;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private ProductMapper productMapper;
    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) throws EmptyFieldException {
        ProductValidator.validateProduct(productMapper.toEntity(productDTO));
        this.productRepository.save(this.productMapper.toEntity(productDTO));
        return productDTO;
    }

    @Override
    public void deleteProduct(Integer id) throws EmptyFieldException {
        ProductValidator.validateInteger(id);
        this.productRepository.deleteById(id);
    }

    @Override
    public ProductDTO findById(Integer id) throws EmptyFieldException {
        ProductValidator.validateInteger(id);
        return this.productMapper.toDTO(this.productRepository.findById(id).orElse(null));
    }

    @Override
    public List<ProductDTO> findAll() {
        return this.productRepository.findAll().stream().map(this.productMapper::toDTO).collect(Collectors.toList());
    }
}
