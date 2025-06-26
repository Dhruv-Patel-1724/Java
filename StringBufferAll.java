package Java2;

public class StringBufferAll {
    public static void main(String[] args) {
        String str = new String("Dhruv");
        StringBuffer s2 = new StringBuffer("Dhruv");
        StringBuilder s3 = new StringBuilder("Dhruv");
        str.concat("Patel");
        s2.append("Patel");
        s3.append("Patel");
        System.out.println(str);
        System.out.println(s2);
        System.out.println(s3);
    }
}
