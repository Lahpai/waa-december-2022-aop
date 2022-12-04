package miu.edu.day5springdata.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.Category;
import miu.edu.day5springdata.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public void save(@RequestBody Category category) {
        categoryService.save(category);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        categoryService.deleteById(id);
    }
}
