package neu.shravya.midterm;

public class Printer {
    public static Printer __instance = null;

    private Printer() {

    }

    public static Printer getInstance() {
        if(__instance == null){
            __instance = new Printer();
        }
        return __instance;
    }

    public void getConnection(){
        System.out.println("Your printer is working");
    }
}
