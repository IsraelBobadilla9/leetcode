package javaProblems;

public class GreatestCommonDivisorOfString {
    public static void main(String[] args) {
        String result = gcdOfStrings("LEET","CODE");
        System.out.println("Resultado: "+result);
    }


    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return null;
    }
}
