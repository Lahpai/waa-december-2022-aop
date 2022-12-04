package miu.edu.day5springdata.service;

import miu.edu.day5springdata.entity.Category;

import java.util.List;

public interface CategoryService {
    void save (Category category);
    List<Category>  getAllCategories();

    Category findById(int id);
    void  deleteById(int id);
}
