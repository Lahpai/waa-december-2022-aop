package miu.edu.day5springdata.service;

import miu.edu.day5springdata.entity.User;

import java.util.List;

public interface UserService {
    void save (User user);
    List<User> getAllUser();
    User findById(int id);
    void deleteById(int id);
}
