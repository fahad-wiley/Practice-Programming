package service;

import dao.AddressBookPersistenceException;
import dto.Address;

import java.util.List;
import java.util.Map;

public interface AddressBookServiceLayer {

    void createAddress(String addressName, Address addressToBeAdded) throws
            AddressBookDuplicateIdException,
            AddressBookDataValidationException,
            AddressBookPersistenceException;

    Map<String, Address> getAllAddresses() throws
            AddressBookPersistenceException;

    Address getAddress(String addressName) throws
            AddressBookPersistenceException;

    Address removeAddress(String addressName) throws
            AddressBookPersistenceException;
}