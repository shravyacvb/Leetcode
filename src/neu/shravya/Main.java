package neu.shravya;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int finalResult = SumUniqueElements.sumUniqueElements(nums);
        System.out.println("sumOfElements--"+finalResult);

        int[] numbers = {-7,-3,2,3,11};
        int[] arrSqNumbers = SquareNumberAscendingOrder.squareNUmberAscendingOrder(numbers);
        System.out.println("arrSqNumbers--"+Arrays.toString(arrSqNumbers));

        int[] arrNum = {2,3,4,2,2,3,5,7};
        finalResult = FirstNonRepeatedInteger.firstNonRepeatedInteger(arrNum);
        System.out.println("firstNonRepeatedInteger--"+finalResult);

        boolean isAnagram = AnagramWords.anagramWords("magazine" , "magazine");
        System.out.println("isAnagram--"+isAnagram);

        boolean isCharacterFollowedByDigit = CharacterFollowedByDigit.characterFollowedByDigit("A2bb2d4");
        System.out.println("isCharacterFollowedByDigit--"+isCharacterFollowedByDigit);

    }
} // end of Main method
