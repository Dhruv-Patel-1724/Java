public class StudentCons {
    private int roll;
    private String name;
    private String dept;
    private String subject;

    public StudentCons(int r,String n,String d,String s){
        roll=r;
        name=n;
        dept=d;
        subject=s;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public String getSubject(){
        return subject;
    }
    public void setRoll(int r){
        if(r>=0)
        roll=r;
        else
        roll=0;
    }
    public void setSub(String s){
        subject=s;
    }
    public String toString(){
        return "rollno "+roll+" \nName: "+name+" \ndepart "+dept+"\nsubject "+subject+"\n";    }
    public static void main(String[] args) {
        StudentCons[] s = new StudentCons[2];
        s[0]= new StudentCons(12, "Dhruv", "It", "Java");
       
        s[1]=new StudentCons(48, "Patel", "Civil", "English");

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].toString());
        }
    }
}
