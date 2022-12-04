package miu.edu.day5springdata.service;

import miu.edu.day5springdata.entity.Address;

import java.util.List;

public interface AddressService {
    void save (Address address);
    List<Address> getAllAddress();

    Address findById(int id);

    void deleteById(int id);
}
