public class Voids {
    public static void username(String email){
        int a = email.indexOf('@');
        String name=email.substring(0, a);
        System.out.println(name);

    }
    public static void main(String[] args) {
        username("dhruv@gmail.com");
    }
}
