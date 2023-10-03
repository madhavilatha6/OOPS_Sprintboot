// 3. Encapsulation Exploration:
// • Create a class Diary with a private attribute secrets and a public method writeEntry(String
// entry).
// • Ensure there’s no direct way to modify or view the secrets attribute outside the class, but entries can
// be added using the provided method.

class EncapsulationExploration {
    private String secrets;

    public void writeEntry(String entry){
        if(secrets == null){
            secrets = entry;
        }else{
            secrets += "\n" + entry;
        }
    }

    public void display(){
        if(secrets != null){
            System.out.print(secrets);
        }else{
            System.out.print("no entries are available");
        }
    }

    public static void main(String[] args){
        EncapsulationExploration mydairy = new EncapsulationExploration();
        mydairy.writeEntry("madhu");
        mydairy.writeEntry("latha");

        mydairy.display();
    }
}