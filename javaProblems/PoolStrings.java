


public class PoolStrings{

    public static void main(String[] args) {
        

        String s1 = "Jose";
        String s2 = "Arturo";
        String s3 = new String("Jose");
        String s4 = "Jose";


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s1.hashCode() == s3.hashCode());
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode() == s4.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        

    }


}