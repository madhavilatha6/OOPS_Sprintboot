// 1. Suitcase Security:
// • Create a class named Suitcase with private attributes: clothes, toiletries, and accessories.
// • Implement public methods to add items to these attributes and a method to view the contents of the
// suitcase.
// • Ensure that the contents cannot be modified directly outside the class.

public class Suitcasesecurity {
    private String clothes;
    private String toiletries;
    private String accessories;

    public void addclothes(String clothes){
        this.clothes = clothes;
    }
    public void addtoiletries( String toiletries){
        this.toiletries = toiletries;
    }
    public void addaccessories(String accessories){
        this.accessories = accessories;
    }
    public void display(){
        System.out.print(clothes);
        System.out.print(toiletries);
        System.out.print(accessories);
    }
    public static void main(String[] args){
        Suitcasesecurity trip = new Suitcasesecurity();
        trip.addtoiletries("makeup kit");
        trip.addclothes("t-shirt");
        trip.addaccessories("chain");

        trip.display();
    }
}
