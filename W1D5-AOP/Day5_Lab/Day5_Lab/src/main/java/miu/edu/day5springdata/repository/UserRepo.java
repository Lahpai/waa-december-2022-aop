package miu.edu.day5springdata.repository;

import miu.edu.day5springdata.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByFirstnameSt();
}
