package neu.shravya;

public class Sad extends Moody{

    //Sad Method

    @Override
    protected String getMood() {
        return "I feel sad today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("""
                ‘waah’ ‘boo hoo’ ‘weep’ ‘sob’""");
    }

    public String toString() {
        return "Subject cries a lot";
    }
}
