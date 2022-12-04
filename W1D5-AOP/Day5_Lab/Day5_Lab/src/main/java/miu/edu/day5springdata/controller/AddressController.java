package miu.edu.day5springdata.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.Address;
import miu.edu.day5springdata.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public void save(@RequestBody Address address) {
        addressService.save(address);
    }

    @GetMapping
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address findById(@PathVariable int id) {
        return addressService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        addressService.deleteById(id);
    }

}
