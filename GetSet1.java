public class Privet {
    private int roll;
    private String name;
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public void setRoll(int r){
        if(r>0)
        roll=r;
        else
        roll=0;
    }
    public void setName(String n){
        name=n;
    }
        
    public static void main(String[] args) {
        Privet p = new Privet();
        // p.name="Dhruv";
        // p.roll=10;
        p.setName("Dhruv");
        p.setRoll(48);
        System.out.println(p.getName());
        System.out.println(p.getRoll());
    }
}
