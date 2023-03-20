package com.rhinolee.springbootmall.service;

import com.rhinolee.springbootmall.dto.ProductQueryParams;
import com.rhinolee.springbootmall.dto.ProductRequest;
import com.rhinolee.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
