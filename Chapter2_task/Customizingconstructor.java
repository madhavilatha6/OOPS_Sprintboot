// Customizing with Constructors: Extend the MountainPeak class to include a parameterized constructor.
// Instantiate the class using this constructor and display the attributes.


//by using without converting to toString method
class Customizingconstructor {
    String mountain;
    int activity;

    public Customizingconstructor( String mountain,int activity){
        this.mountain = mountain;
        this.activity = activity;
    }
    public void display(){
        System.out.print(mountain + activity);
    }
    public static void main ( String[] args){
        Customizingconstructor trip = new Customizingconstructor("evarest", 2000);
        trip.display();
    }
}


//By using with toString method

// class Customizingconstructor {
//     String mountain;
//     int activity;

//     public Customizingconstructor( String mountain,int activity){
//         this.mountain = mountain;
//         this.activity = activity;
//     }
//     public String toString(){
//         return mountain+activity;
//     }
//     public static void main ( String[] args){
//         Customizingconstructor trip = new Customizingconstructor("evarest", 2000);
//         System.out.print(trip);
//     }
// }