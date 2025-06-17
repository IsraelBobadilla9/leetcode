import java.util.Arrays;

public class MergeSort {
    

    public static void main(String[] args) {
        int[] nums = new int[]{3,9,7,8,5,9,4,2,6,1};
        int[] resultado = sortArray(nums);
        System.out.println(" ---------- SORTED ARRAY ");
        Arrays.stream(resultado).forEach(value -> System.out.print(value));
        System.out.println("------------- END SORTED");
    }

    public static int[] sortArray(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int mitad = nums.length /2;
        int[] a = new int[mitad];
        int[] b = new int[nums.length - mitad];
        int k = 0;
        for(int i = 0; i < mitad ; i++){
            a[i] = nums[i];
        }
        
        for(int i = mitad; i < nums.length ; i++){
            b[k] = nums[i];
            k++;
        }

        a = sortArray(a);
        b = sortArray(b);
        return mergeArrays(a,b,nums);        
    }

    public static int[] mergeArrays(int[] a, int[] b, int[]nums){
        int max = Math.max(a.length, b.length);
        int valA = -1,valB =-1;
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(j < a.length){
                valA = a[j];
            }
            
            if(k < b.length){
                valB=b[k];
            }

            if( j < a.length && k < b.length && valA < valB ){
                nums[i] = valA;
                j++;
                continue;
            }else if( j < a.length && k < b.length && valA > valB){
                nums[i] = valB;
                k++;
                continue;
            }
            if(j < a.length){
                nums[i] = valA;
                j++;
            }else if(k < b.length){
                nums[i] = valB;
                k++;
            }
        }
        return nums;
    }
}
// 37854261
// 01234567
// 12345678 
