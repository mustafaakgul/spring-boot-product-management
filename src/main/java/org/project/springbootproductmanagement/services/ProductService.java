package org.project.springbootproductmanagement.services;

import org.project.springbootproductmanagement.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Long id);

    Product saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);
}
