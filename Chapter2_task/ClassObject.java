// 1. Class and Object Creation: Define a class named MountainPeak with attributes peakName and
// altitude. Create an object of this class and display its attributes.
class ClassObject {
    String mountain;
    int altitude;

    public ClassObject(String mountain, int altitude) {
        this.mountain = mountain;
        this.altitude = altitude;
    }

    public void displayDetails() {
        System.out.println("Mountain: " + mountain + ", Altitude: " + altitude);
    }

    public static void main(String[] args) {
        ClassObject trip = new ClassObject("Everest", 1000);
        trip.displayDetails();
    }
}
