package neu.shravya;

public class SquareNumberAscendingOrder {

    //squares of each number sorted in non-decreasing order
    public static int[] squareNUmberAscendingOrder(int[] nums){
        int temp;

        if(nums == null || nums.length == 0){
            return null;
        }

        for(int i=0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int j=0 ; j < nums.length - 1 ; j++) {
            for (int i = 0; i < nums.length - j - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        return nums;
    }
}
