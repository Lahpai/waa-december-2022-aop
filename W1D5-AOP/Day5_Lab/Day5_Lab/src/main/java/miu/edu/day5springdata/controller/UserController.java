package miu.edu.day5springdata.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.User;
import miu.edu.day5springdata.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        return userService.findById(id);
    }
}
