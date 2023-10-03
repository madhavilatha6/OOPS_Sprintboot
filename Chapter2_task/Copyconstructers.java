//4. Replicating with Copy Constructors: Add a copy constructor to the MountainPeak class. Create an object
// that’s a copy of an existing MountainPeak object.

class Copyconstructers {
    String destination;
    String activity;

    public Copyconstructers ( String destination,String activity){
        this.destination = destination;
        this.activity = activity;
    }

    public Copyconstructers ( Copyconstructers original){
        this.destination = original.destination;
        this.activity = original.activity;
    }

    public void reach(){
        System.out.print(destination + activity);
    }
    public static void main(String[] args){
        Copyconstructers trip = new Copyconstructers("mountain","trecking");
        Copyconstructers trecking = new Copyconstructers(trip);
        trecking.reach();
    }
}