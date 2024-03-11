public class Airplane {
    private String tailNumber;
    private double latitude;
    private double longitude;
    private double altitude; // In metres
    private double speed; // In knots
    private String status; // E.g., "Ascending", "Cruising", "Descending"

    public Airplane(String tailNumber, double latitude, double longitude, double altitude, double speed, String status) {
        this.tailNumber = tailNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.speed = speed;
        this.status = status;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void updatePosition(double latitude, double longitude, double altitude) {
        setLatitude(latitude);
        setLongitude(longitude);
        setAltitude(altitude);
    }

    public void changeStatus(String newStatus) {
        setStatus(newStatus);
    }

    public static void main(String[] args) {
    }
}
