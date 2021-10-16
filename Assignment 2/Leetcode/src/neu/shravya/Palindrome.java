package neu.shravya;

public class Palindrome {
    public static boolean palindromeMethod(String str){
        str = str.toLowerCase().replaceAll("[^a-z0-9]+","");
        int i = 0;
        int j = str.length()-1;
        char s1;
        char s2;

        if(str.isBlank() || str.isEmpty()){
            return true;
        }

        while( i < j){
            s1 = str.charAt(i);
            s2 = str.charAt(j);

            if(s1 == s2){
                i++;
                j--;
            }else {
                return false;
            }
        }

        if(i>=j){
            return true;
        }
        return false;
    }
}
