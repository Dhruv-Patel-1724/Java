public class Challenge1 {
    public static void main(String[] args) {
        String str = "dhruv@gmail.com";
        int i=str.indexOf("@");
        String uname=(str.substring(0, i)); 
        String domain = str.substring(i+1, str.length());
        System.out.println("uname is: "+uname);
        System.out.println("domain is: "+domain);

        String a ="a!w@234%";
        System.out.println(a.replaceAll("[^a-z A-Z 0-9]", ""));

        String h= "   dh ru v" ;
        String j = h.replaceAll("\\s+", "");
System.out.println(j);
    }
}
