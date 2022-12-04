package miu.edu.day5springdata.repository;

import miu.edu.day5springdata.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {
}
