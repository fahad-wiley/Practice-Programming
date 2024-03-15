package dao;

import dto.Address;

import java.util.Map;

public interface AddressBookDao {

    Address addAddress(String addressName, Address Address);

    Map<String, Address> getAllStudents();

    Address getAddress(String addressName);

    Address removeAddress(String addressName);
}
