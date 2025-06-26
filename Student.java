public class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

  
    public int total(){
        return m1+m2+m3;
    }
    public float avg(){
        return total()/3;
    }
    public char gread(){
        if(avg()>=70)
        return 'A';
        else
        return 'B';
    }
    public String details(){
        return "roll no"+roll+"name"+name+"course"+course;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Dhruv";
        s.roll=45;
        s.course="IT";
        s.m1=70;
        s.m2=75;
        s.m3=75;
        System.out.println(s.total());
        System.out.println(s.avg());
        System.out.println(s.gread());
        System.out.println(s.details());
    }
}
