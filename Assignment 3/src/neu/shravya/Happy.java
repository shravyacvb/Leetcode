package neu.shravya;

public class Happy extends Moody{

    @Override
    protected String getMood() {
        return "I feel Happy today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString() {
        return "Subject laughs a lot";
    }
}
