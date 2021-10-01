package neu.shravya;

public class CharacterFollowedByDigit {

    //check if the string has no letter followed by another letter, and no digit followed by another digit
    public static boolean characterFollowedByDigit(String str){
        char[] charArr = str.toCharArray();
        boolean isFollowedByDigit = false;
        for(int i=0; i < charArr.length - 1 ; i++){

            if((charArr[i] >= 'a' && charArr[i] <= 'z') || (charArr[i] >= 'A' && charArr[i] <= 'Z')){
                if(charArr[i+1] >= '0' && charArr[i+1] <= '9'){
                    isFollowedByDigit = true;
                }

            } else if(charArr[i] >= '0' && charArr[i] <= '9') {
                if((charArr[i+1] >= 'a' && charArr[i+1] <= 'z') || (charArr[i+1] >= 'A' && charArr[i+1] <= 'Z')) {
                    isFollowedByDigit = true;
                }
            }

            if(!isFollowedByDigit){
                return false;
            }
        }
        return true;
    }
}
