import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

        int[] values = new int[] { 1,5,2,0,6,8,0,6,0};
        values = duplicateZeros2(values);
        System.out.println();
        Arrays.stream(values).forEach(value -> System.out.print(value));
    }

    public static int[] duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        int k = 0;
        for (int i = 0; i < result.length; i++) {

            if (result[i] == 0) {
                arr[k] = 0;
                k++;
                if (k < result.length) {
                    arr[k] = 0;
                }
            } else {
                if (k < result.length) {
                    arr[k] = result[i];
                }
            }
            k++;
        }
        return result;
    }

    // utilizando solo el arreglo principal

    public static int[] duplicateZeros2(int[] arr) {
       int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                k++;
            }
       }
       System.out.println(k);
       System.out.println(arr.length-1);
       if(k != 0 && k != (arr.length)){
        
       k = ( arr.length ) - (k-1);
       System.out.println("POSITION K "+k);
       for(int i =(arr.length -1) ; i > 0  ; i--){
            System.out.println("Inicio K "+ k +" I "+i);
            if(k == i){
                arr[i] = arr[k];
            }else if(arr[k] == 0){
                arr[i] = 0;
                i--;
                arr[i] = 0;
            }else{
                arr[i] = arr[k];
            }
            
            k--;
            System.out.println("end K "+ k +" I "+i);
       }


        return arr;
    }
    return arr;
    }
}
