package neu.shravya;

import java.util.HashMap;

public class Isomorphic {
    public static boolean isomorphicMethod(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] sString = s.toCharArray();
        char[] tString = t.toCharArray();

        HashMap<Character,Character> mapSToT = new HashMap<>();
        HashMap<Character,Character> mapTToS = new HashMap<>();

        for (int i = 0; i < sString.length ; i++){
            if(mapSToT.containsKey(sString[i])){
                if(mapSToT.get(sString[i]) == tString[i]){
                    continue;
                } else {
                    return false;
                }
            } else if(mapTToS.containsKey(tString[i])){
                return false;
            } else {
                mapSToT.put(sString[i],tString[i]);
                mapTToS.put(tString[i],sString[i]);
            }
        }
        return true;
    }
}
