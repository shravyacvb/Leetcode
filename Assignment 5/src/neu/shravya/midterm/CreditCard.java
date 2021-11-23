package neu.shravya.midterm;

public class CreditCard implements iPaymentStrategy {

    private static String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard : $" + String.valueOf(amount));
    }
}
