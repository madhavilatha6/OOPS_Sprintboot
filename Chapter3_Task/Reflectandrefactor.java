// Reflect and Refactor:
// • Revisit the Suitcase class from Task 1. Add a method that allows the user to remove items from the
// suitcase.
// • Ensure that this method adheres to the principles of encapsulation, i.e., the internal representation of
// the suitcase contents should remain hidden from the user.


public class Reflectandrefactor {
    private String clothes;
    private String accessories;

    public void addclothes(String clothes){
        this.clothes = clothes;
    }

    public void addaccessories(String accessories){
        this.accessories = accessories;
    }

    public void display(){
        System.out.println("clothes :" + " "+ (clothes != null ? clothes : " none"));
        System.out.println("accessories :" + " "+(accessories != null ? accessories :"None"));
    }

    public void removeItem( String item){
        switch (item){
            case "clothes" :
                this.clothes = null;
                break;
            case "accessories" :
                this.accessories = null;
                break;
            default:
                System.out.print("no items are there");
        }
    }

    public static void main(String[] args){
        Reflectandrefactor trip = new Reflectandrefactor();
        trip.addclothes("t-shirt");
        trip.addaccessories("chain");

        trip.display();

        trip.removeItem("clothes");
        trip.display();
    }


}
