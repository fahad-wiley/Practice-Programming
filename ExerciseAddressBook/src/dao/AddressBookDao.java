package dao;

import dto.Address;

import java.util.Map;

public interface AddressBookDao {

    Address addAddress(String addressName, Address Address);

    Map<String, Address> getAllAddresses();

    Address getAddress(String addressName);

    Address removeAddress(String addressName);

    boolean addressExists(String houseNameOrNumber, String postcode);
}
