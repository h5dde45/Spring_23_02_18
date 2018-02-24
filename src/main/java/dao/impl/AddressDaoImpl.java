package dao.impl;

import bl.Util;
import dao.interfaces.AddressDao;
import entity.Address;

import java.sql.Connection;
import java.util.List;

public class AddressDaoImpl implements AddressDao {

    Connection connection = new Util().getConnection();

    public void add(Address address) {
        String sql = "insert into address(id, country,city,street, post_code values(?,?,?,?,?)";

    }

    public List<Address> getAll() {
        return null;
    }

    public Address getById(int id) {
        return null;
    }

    public void update(Address address) {

    }

    public void delete(Address address) {

    }
}
