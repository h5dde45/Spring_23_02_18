package service.interfaces;

import entity.Address;

import java.util.List;

public interface AddressService {
    void add(Address address);

    List<Address> getAll();

    Address getById(int id);

    void update(Address address);

    void delete(Address address);
}
