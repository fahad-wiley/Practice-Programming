public class ClassModeling {
    public static void main(String[] args) {
        // making my house object
        House myHouse = new House("8 Woodcroft Avenue", -80.191788, 25.761681, 200);
        System.out.println(myHouse.getAddress());
        System.out.println(myHouse.getLatitude());
        System.out.println(myHouse.getLongitude());

        // making my airplane object
        Airplane airplane = new Airplane("N12345", 40, -74, 30000, 400, "Cruising");
        System.out.println("Airplane " + airplane.getTailNumber() + " is currently " + airplane.getStatus());

        // Example update
        airplane.updatePosition(50, -84, 28000);
        airplane.changeStatus("Descending");
        System.out.println("Airplane " + airplane.getTailNumber() + " updated status: " + airplane.getStatus());
    }
}