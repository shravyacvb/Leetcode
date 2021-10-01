package neu.shravya;

public class FirstNonRepeatedInteger {

    //first non repeated integer in an array
    public static int firstNonRepeatedInteger(int[] nums) {
        boolean unique;
        int nonRepeatedNum = 0;

        if(nums == null || nums.length == 0){
            return 0;
        }

        for(int i=0; i < nums.length; i++) {
            unique = true;
            for (int j = 0; j < nums.length; j++) {
                if( i!=j && nums[i] == nums[j]){
                    unique = false;
                    break;
                }
            }
            if(unique){
                return nums[i];
            }
        }

        return 0;
    }
}
