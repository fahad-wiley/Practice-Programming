package ui;

import dto.Address;

import java.util.Map;

public class AddressBookView {
    private UserIO io = new UserIOConsoleImpl();
    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Addresses");
        io.print("2. Create Address");
        io.print("3. View an Address");
        io.print("4. Remove an Address");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    public String getNewAddressName() {
        return io.readString("Please enter Address Name to store as");
    }
    public Address getNewAddressInfo() {
        String houseNameOrNumber = io.readString("Please enter House name or Number");
        String streetName = io.readString("Please enter Street Name");
        String townOrCity = io.readString("Please enter Town or City");
        String county = io.readString("Please enter County");
        String postcode = io.readString("Please enter Postcode");
        Address address = new Address(houseNameOrNumber, streetName, townOrCity, county, postcode);
        return address;
    }
    public void displayAddressList(Map<String, Address> addressList) {
        for (Address currentAddress : addressList.values()) {
            String addressInfo = String.format("#%s : %s %s, %s, %s",
                    currentAddress.getHouseNameOrNumber(),
                    currentAddress.getStreetName(),
                    currentAddress.getTownOrCity(),
                    currentAddress.getCounty(),
                    currentAddress.getPostcode());
            io.print(addressInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayAddress(Address address) {
        String addressInfo = String.format("#%s : %s %s, %s, %s",
                address.getHouseNameOrNumber(),
                address.getStreetName(),
                address.getTownOrCity(),
                address.getCounty(),
                address.getPostcode());
        io.print(addressInfo);
        io.readString("Please hit enter to continue.");
    }


    public String getAddressName() {
        return io.readString("Please enter Address Name.");

    }

    public void displayCreateAddressBanner() {
        io.print("=== Create Address ===");
    }
    public void displaySuccessAddressBanner() {
        io.print("Created Address Successfully");
    }

    public void displayViewAddressBanner() {
        io.print("=== View Address ===");
    }

    public void displayRemoveAddressBanner() {
        io.print("=== Remove Address ===");
    }



}