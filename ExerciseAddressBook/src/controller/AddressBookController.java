package controller;

import dao.AddressBookDao;
import dao.AddressBookDaoImpl;
import dao.AddressBookPersistenceException;
import dto.Address;
import service.AddressBookDataValidationException;
import service.AddressBookDuplicateIdException;
import service.AddressBookServiceLayerImpl;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class AddressBookController {
    private UserIO io = new UserIOConsoleImpl();
    private AddressBookView view;
    private AddressBookServiceLayerImpl service;

    public AddressBookController (AddressBookServiceLayerImpl service ,AddressBookView view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listAddresses();
                    break;
                case 2:
                    createAddress();
                    break;
                case 3:
                    viewAddresses();
                    break;
                case 4:
                    removeAddress();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    }


    private void listAddresses() throws AddressBookPersistenceException {
        Map<String, Address> addressList = service.getAllAddresses();
        view.displayAddressList(addressList);
    }
    private void createAddress() throws AddressBookDuplicateIdException, AddressBookDataValidationException, AddressBookPersistenceException {
        view.displayCreateAddressBanner();
        String addressName = view.getNewAddressName();
        Address addressToBeAdded = view.getNewAddressInfo();
        service.createAddress(addressName, addressToBeAdded);
        view.displaySuccessAddressBanner();
    }
    private void viewAddresses() throws AddressBookPersistenceException {
        view.displayViewAddressBanner();
        String addressName = view.getAddressName();
        Address addressToShow = service.getAddress(addressName);
        view.displayAddress(addressToShow);
    }
    private void removeAddress() throws AddressBookPersistenceException {
        view.displayRemoveAddressBanner();
        String addressNameToRemove = view.getAddressName();
        service.removeAddress(addressNameToRemove);
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void unknownCommand() {
    }
    private void exitMessage() {
    }
}
