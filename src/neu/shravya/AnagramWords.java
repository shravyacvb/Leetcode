package neu.shravya;

import java.util.HashMap;

public class AnagramWords {

    //if ransomNote can be constructed from magazine
    public static boolean anagramWords(String ransomNote, String magazine) {
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0 ; i< magazineArray.length ; i++){
            if(map.containsKey(magazineArray[i])){
                map.put(magazineArray[i], map.get(magazineArray[i]) + 1);
            } else {
                map.put(magazineArray[i], 1);
            }
        }

        for(int i=0 ; i < ransomArray.length ; i++){
            if(map.containsKey(ransomArray[i])){
                map.put(ransomArray[i], map.get(ransomArray[i]) - 1);
                if(map.get(ransomArray[i]) <= 0){
                    map.remove(ransomArray[i]);
                }
            } else
                return false;
        }

        return true;
    }
}
