package com.rhinolee.springbootmall.dao;

import com.rhinolee.springbootmall.dto.ProductRequest;
import com.rhinolee.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
