public class MetaCharecter {
    public static void main(String[] args) {
        String s = "a";
        String d = " a";
        String h = "a";
        String j = "dhruv@gmail.com";
        System.out.println(j.matches("\\w*@gmail(.+)"));
        // System.out.println(s.matches("\\w"));
        // System.out.println(d.matches("\\w"));

        // System.out.println(s.matches("\\W"));
        // System.out.println(d.matches("\\W"));

        //System.out.println(h.matches("\\s"));
        //System.out.println(d.matches("\\s"));

        //System.out.println(h.matches("\\S"));
        // System.out.println(s.matches("\\S"));

        // System.out.println(s.matches("\\d"));
        // System.out.println(d.matches("\\d"));

        //System.out.println(s.matches("\\D"));
        // System.out.println(d.matches("\\D"));
    }
}
