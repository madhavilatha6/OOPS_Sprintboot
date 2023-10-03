//5. Exploring Multiple Interfaces:
// Define another interface named Trekable with a method
// trekDifficulty(). Make the MountainPeak class implement this interface and provide an appro-
// priate implementation.


interface Trekable {
    void trekDifficulty();
}
class MultipleInterfaces implements Trekable{
    
    public void trekDifficulty(){
        System.out.print("trekdifficulty");
    }
    public static void main(String[] args){
        MultipleInterfaces trip = new MultipleInterfaces();
        trip.trekDifficulty();
    }
}