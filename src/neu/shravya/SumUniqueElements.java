package neu.shravya;

public class SumUniqueElements {

    // sum of all the unique elements
    public static int sumUniqueElements(int[] nums){
        boolean unique;
        int sum = 0;

        if(nums == null || nums.length == 0){
            return 0;
        }

        for(int i=0; i < nums.length; i++){
            unique = true;
            for(int j=0; j < nums.length; j++){
                if( i!=j && nums[i] == nums[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
