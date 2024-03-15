package dto;

public class Address {
    private String houseNameOrNumber;
    private String streetName;
    private String townOrCity;
    private String county;
    private String postcode;

    public Address(String houseNameOrNumber, String streetName, String townOrCity, String county, String postcode) { //TODO: add other constructors
        this.houseNameOrNumber = houseNameOrNumber;
        this.streetName = streetName;
        this.townOrCity = townOrCity;
        this.county = county;
        this.postcode = postcode;
    }

    public String getHouseNameOrNumber() {
        return houseNameOrNumber;
    }

    public void setHouseNameOrNumber(String houseNameOrNumber) {
        this.houseNameOrNumber = houseNameOrNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTownOrCity() {
        return townOrCity;
    }

    public void setTownOrCity(String townOrCity) {
        this.townOrCity = townOrCity;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

}
