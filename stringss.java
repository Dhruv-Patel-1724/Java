public class stringss {
    public static void main(String[] args) {
        char c [] = {'a','b','c'};
        String str = new String(c);
        System.out.println(str);

        byte b []={65,66,67,90};
        String s = new String(b);
System.out.println(s);

String q ="welcom";
String r=q.replace('e', 'z');
System.out.println(r);

String t = new String ("DHRUV");
String u =t.toLowerCase();
System.out.println(u);//store in heap create new object every time

String i = "DHRUV";
i =i.toLowerCase();
System.out.println(i.charAt(2));
System.out.println(i);// store in pool and not create new object every time


String h = "java";
String h2 = "java";
String h3 =new String ("java");
System.out.println(h == h2);
System.out.println(h2 == h3);
System.out.println(h+" "+h2+" "+h3);

String str4 = "Dhr";
String str5 = new String("Patel");
System.out.println(str4.compareTo(str5));

String d = "7";
System.out.println(d.matches("[a-z,0-9]"));
}
}
