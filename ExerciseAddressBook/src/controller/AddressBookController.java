package controller;

import dao.AddressBookDao;
import dao.AddressBookDaoImpl;
import dto.Address;
import ui.AddressBookView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class AddressBookController {
    private AddressBookDaoImpl dao = new AddressBookDaoImpl();
    //private AddressBookServiceLayer service;
    private UserIO io = new UserIOConsoleImpl();
    private AddressBookView view = new AddressBookView(io);


    public AddressBookController (AddressBookView view) {
        //this.service = service;
        this.view = view;
    }

    public void run() {
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


    private void listAddresses() {
        Map<String, Address> addressList = dao.getAllStudents();
        view.displayAddressList(addressList);
    }
    private void createAddress() {
        view.displayCreateAddressBanner();
        String addressName = view.getNewAddressName();
        Address addressToBeAdded = view.getNewAddressInfo();
        dao.addAddress(addressName, addressToBeAdded);
        view.displaySuccessAddressBanner();
    }
    private void viewAddresses() {
        view.displayViewAddressBanner();
        String addressName = view.getAddressName();
        Address addressToShow = dao.getAddress(addressName);
        view.displayAddress(addressToShow);
    }
    private void removeAddress() {
        view.displayRemoveAddressBanner();
        String addressNameToRemove = view.getAddressName();
        dao.removeAddress(addressNameToRemove);
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void unknownCommand() {
    }
    private void exitMessage() {
    }
}
