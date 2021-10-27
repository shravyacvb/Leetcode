package neu.shravya.midterm;

import java.util.HashSet;
import java.util.Set;

public class SubstringWithoutRepeatation {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        char[] stringCharArray = s.toCharArray();

        for(int i=0;i<stringCharArray.length;i++){
            Set<Character> set = new HashSet<>();
            for(int j=i;j<stringCharArray.length;j++){
                if(set.add(stringCharArray[j])){
                    maxLength = Math.max(maxLength,j-i+1);
                }else
                    break;
            }
        }

        return maxLength;
    }
}
