import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] candies = new int[]{2,3,5,1,3};
        List<Boolean> result =  kidsWithCandies(candies, 3);
    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();
        max -= extraCandies;
        for(int i = 0; i < candies.length; i++){
            if( candies[i] >= max ){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}
