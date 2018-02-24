package dao.interfaces;

import entity.Address;

import java.util.List;

public interface AddressDao {
    void add(Address address);

    List<Address> getAll();

    Address getById(int id);

    void update(Address address);

    void delete(Address address);
}
