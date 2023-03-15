package com.rhinolee.springbootmall.dao;

import com.rhinolee.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
