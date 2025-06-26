public class Returns {
   static String username(String email){
        int a=email.indexOf('@');
        String name=email.substring(0, a);
        return name;
    }
    public static void main(String[] args) {
        String srt =username ("dhruv@gmmail.com");
        System.out.println(srt);
    }
}
