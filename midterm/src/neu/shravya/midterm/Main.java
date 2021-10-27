package neu.shravya.midterm;

public class Main {

    public static void main(String[] args) {

        //Question 2
        System.out.println("QUESTION 2");
	    Printer p1 = Printer.getInstance();
        p1.getConnection();
        System.out.println();

        //Question 3
        System.out.println("QUESTION 3");
        int[] nums = {1,3,-1,3,4,4,-1};
        int sumNonRepeatingNumbers = SumNonRepeatingNumbers.nonRepeatingNumbersSum(nums);
        System.out.println(sumNonRepeatingNumbers);
        System.out.println();

        //Question 4
        System.out.println("QUESTION 4");
        int longestString = SubstringWithoutRepeatation.lengthOfLongestSubstring("abcabcbb");
        System.out.println(longestString);
    }
}
