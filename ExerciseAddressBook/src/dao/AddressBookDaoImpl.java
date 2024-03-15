package dao;

import dto.Address;

import java.util.HashMap;
import java.util.Map;

public class AddressBookDaoImpl implements AddressBookDao {
    private Map<String, Address> addresses = new HashMap<>();
    public AddressBookDaoImpl() {

    }


    @Override
    public Address addAddress(String addressName, Address Address) {
        addresses.put(addressName, Address);
        return Address;
    }

    @Override
    public Map<String, Address> getAllAddresses() {
        return addresses;
    }

    @Override
    public Address getAddress(String addressName) {
        return addresses.get(addressName);
    }

    @Override
    public Address removeAddress(String addressName) {
        return addresses.remove(addressName);
    }

    @Override
    public boolean addressExists(String houseNameOrNumber, String postcode) {
        for (Address address : addresses.values()) {
            if (address.getHouseNameOrNumber().equals(houseNameOrNumber) && address.getPostcode().equals(postcode)) return true;
        }
        return false;
    }
}
