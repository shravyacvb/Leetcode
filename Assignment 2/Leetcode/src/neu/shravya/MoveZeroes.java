package neu.shravya;

public class MoveZeroes {
    public static int[] moveZeroMethod(int[] nums){
        int temp = 0;
        int j = 0;

        if(nums == null || nums.length == 0){
            return null;
        }

        for (int i=0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        while( j < nums.length){
            nums[j++] = 0;
        }

        return nums;
    }
}
