package service;

import dao.AddressBookDao;
import dao.AddressBookPersistenceException;
import dto.Address;
import ui.AddressBookView;

import java.util.List;
import java.util.Map;

public class AddressBookServiceLayerImpl implements
        AddressBookServiceLayer {
    AddressBookDao dao;
    AddressBookView view;

    public AddressBookServiceLayerImpl(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }

    @Override
    public void createAddress(String addressName, Address addressToBeAdded) throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException {
        if (addressToBeAdded.getHouseNameOrNumber() == null || addressToBeAdded.getHouseNameOrNumber().trim().isEmpty() ||
                addressToBeAdded.getStreetName() == null || addressToBeAdded.getStreetName().trim().isEmpty() ||
                addressToBeAdded.getTownOrCity() == null || addressToBeAdded.getTownOrCity().trim().isEmpty() ||
                addressToBeAdded.getCounty() == null || addressToBeAdded.getCounty().trim().isEmpty() ||
                addressToBeAdded.getPostcode() == null || addressToBeAdded.getPostcode().trim().isEmpty()) {
            throw new AddressBookDataValidationException("ERROR: All address fields [House Name/Number, Street, Town/City, County, Postcode] are required.");
        }
        if (dao.addressExists(addressToBeAdded.getHouseNameOrNumber(), addressToBeAdded.getPostcode())) {
            throw new AddressBookDuplicateIdException("ERROR: Could not create address. Address at "
                    + addressToBeAdded.getHouseNameOrNumber() + ", " + addressToBeAdded.getPostcode() + " already exists.");
        }

        dao.addAddress(addressName, addressToBeAdded);
    }

    @Override
    public Map<String, Address> getAllAddresses() throws AddressBookPersistenceException {
        return dao.getAllAddresses();
    }

    @Override
    public Address getAddress(String addressName) throws AddressBookPersistenceException {
        return dao.getAddress(addressName);
    }

    @Override
    public Address removeAddress(String addressName) throws AddressBookPersistenceException {
        return dao.removeAddress(addressName);
    }
}