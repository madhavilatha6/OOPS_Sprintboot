// 4. Immutable Passport:
// • Design a class Passport with attributes: passportNumber, name, and expiryDate. Ensure that
// once a Passport object is created, its attributes cannot be modified.
// • Hint: Consider making the attributes final without providing setter methods.

public class Immutablepassport {
    private final String passportnumber;
    private final String name;
    private final String expiryDate;

    public Immutablepassport( String passportnumber,String name,String expirydate){
        this.passportnumber = passportnumber;
        this.name = name;
        this.expiryDate = expirydate;
    }

    public void display(){
        System.out.print(passportnumber+name+expiryDate);
    }

    public static void main(String[] args){
        Immutablepassport trip = new Immutablepassport("234","madhu","01-01-2024");
        trip.display();
    }
}
