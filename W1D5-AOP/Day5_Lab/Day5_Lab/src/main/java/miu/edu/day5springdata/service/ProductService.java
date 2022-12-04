package miu.edu.day5springdata.service;

import miu.edu.day5springdata.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);
    List<Product> getAllProduct();
    void update(Product product, int id);
    Product findById(int id);
    void deleteById(int id);
}
