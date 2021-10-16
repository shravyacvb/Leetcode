package neu.shravya;

public class ShortestDistance {
    public static int shortestDistance(String[] wordsDict, String word1, String word2){
        int distance = -1;
        int a = 0;
        int b = 0;

        if(wordsDict.length == 0 || wordsDict == null){
            System.out.println("wordsDict is Empty");
            return 0;
        }

        for(int i=0; i < wordsDict.length ; i++){
            if(wordsDict[i].equals(word1)){
                a = i+1;
            } else if(wordsDict[i].equals(word2)){
                b = i+1;
            }

            if(a!=0 && b!=0){
                if(distance==-1){
                    distance = Math.abs(b-a);
                } else if(Math.abs(b-a) < distance){
                    distance = Math.abs(b-a);
                }
            }
        }

        return distance;
    }
}
