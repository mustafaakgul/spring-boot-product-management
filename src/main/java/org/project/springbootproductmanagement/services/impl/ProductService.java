package org.project.springbootproductmanagement.services.impl;

import org.project.springbootproductmanagement.models.Product;
import org.project.springbootproductmanagement.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements org.project.springbootproductmanagement.services.ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        List<Product> products = new List<Product>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
