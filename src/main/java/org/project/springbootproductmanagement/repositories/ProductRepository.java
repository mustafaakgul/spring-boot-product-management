package org.project.springbootproductmanagement.repositories;

import org.project.springbootproductmanagement.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
