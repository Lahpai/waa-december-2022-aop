package miu.edu.day5springdata.repository;

import miu.edu.day5springdata.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
}
