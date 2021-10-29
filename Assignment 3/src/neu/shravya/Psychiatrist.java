package neu.shravya;

public class Psychiatrist {

    public void examine(Moody moodyObject){
        moodyObject.queryMood();
        System.out.println(moodyObject.getMood());
    }

    public void observe(Moody moodyObject){
        moodyObject.expressFeelings();
        System.out.println("Observation: "+moodyObject.toString());
    }

}
