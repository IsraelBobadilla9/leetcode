
package javaProblems;

class MergeStringsAlternately {

    
    public static void main(String[] args) {

        System.out.println("START ");

        String resultado = mergeAlternately("abcd","pq");
        System.out.println();
        System.out.println(resultado);
        System.out.println("END");

    }

    public static String mergeAlternately(String word1, String word2) {
        int max = (word1.length() > word2.length()) ?  word1.length(): word2.length();
        String result = "";
        int i = 0;
        while( i < max){
            if(i < word1.length()){
                result+=word1.charAt(i);
            }

            if(i < word2.length()){
                result+=word2.charAt(i);
            }
            i++;
        } 
        return result;
    }

}
