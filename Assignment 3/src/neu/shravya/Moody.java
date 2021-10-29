package neu.shravya;

public abstract class Moody {
    protected abstract String getMood();
    public abstract void expressFeelings();

    public void queryMood() {
        System.out.println("How are you feeling today?");
    }
}
