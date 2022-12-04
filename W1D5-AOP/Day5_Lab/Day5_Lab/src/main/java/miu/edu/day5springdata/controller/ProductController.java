package miu.edu.day5springdata.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.Product;
import miu.edu.day5springdata.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping
    public void save(@PathVariable int id, @RequestBody Product product) {
        productService.update(product, id);
    }

    @DeleteMapping
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }
}
