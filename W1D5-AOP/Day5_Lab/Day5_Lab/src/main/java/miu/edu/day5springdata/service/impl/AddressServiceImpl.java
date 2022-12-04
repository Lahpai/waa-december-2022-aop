package miu.edu.day5springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.day5springdata.entity.Address;
import miu.edu.day5springdata.repository.AddressRepo;
import miu.edu.day5springdata.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    @Override
    public Address findById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
         addressRepo.deleteById(id);
    }
}
