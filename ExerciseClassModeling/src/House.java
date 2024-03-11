public class House {
    private String address;
    private double longitude;
    private double latitude;
    private double squareMetres;


    public House(String address, double longitude, double latitude, double squareMetres) {
        // properties of a gps-house
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.squareMetres = squareMetres;

    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    public double getSquareMetres() {
        return squareMetres;
    }


    public void setSquareMetres(double squareMetres) {
        this.squareMetres = squareMetres;
    }

    public static void main(String[] args) {
    }
}