//3. Interface Implementation: Define an interface named Climbable with a method canClimb(). Implement
// this interface in the MountainPeak class and provide an implementation for the method.



interface Climbable{
    void canClimb();
}
class Interfaceimplementation implements Climbable{
    public void canClimb(){
        System.out.print("I will climb this mountain");
    }
    
    public static void main(String[] args){
        Interfaceimplementation trip = new Interfaceimplementation();
        trip.canClimb();
    }
}