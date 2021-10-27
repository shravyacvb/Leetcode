package neu.shravya.midterm;

import java.util.HashMap;

public class SumNonRepeatingNumbers {
    public static int nonRepeatingNumbersSum(int[] nums){

        int sumNumbers = 0;

        HashMap<Integer,Integer> mapNumberOccurences = new HashMap<>();

        for (int n : nums) {
            if(mapNumberOccurences.containsKey(n)){
                mapNumberOccurences.put(n, mapNumberOccurences.get(n) + 1);
            } else {
                mapNumberOccurences.put(n,1);
            }
        }

        for (int n : mapNumberOccurences.keySet()) {
            if(mapNumberOccurences.get(n) > 1){
                sumNumbers += n;
            }
        }

        return sumNumbers;
    }
}
