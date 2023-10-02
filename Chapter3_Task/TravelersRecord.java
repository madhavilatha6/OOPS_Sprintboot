// package Chapter3_Task;

public class TravelersRecord {
    private String name;
    private String destination;
    private String date;

    public TravelersRecord ( String name, String destination , String date){
        this.name = name;
        this.destination = destination;
        this.date  = date;
    }
    
    public String getname(){
        return name;
    }

    public String getdestination(){
        return destination;
    }

    public String getdate(){
        return date;
    }
    public static void main(String[] args){
        TravelersRecord trip = new TravelersRecord("madhu" , "palamaner" , "20--8-2023");
        System.out.println(trip.getname());
        System.out.println(trip.getdestination());
        System.out.println(trip.getdate());
    }
}
