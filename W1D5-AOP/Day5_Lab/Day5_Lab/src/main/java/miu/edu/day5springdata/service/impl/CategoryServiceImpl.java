package miu.edu.day5springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.Category;
import miu.edu.day5springdata.repository.CategoryRepo;
import miu.edu.day5springdata.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        categoryRepo.deleteById(id);
    }
}
