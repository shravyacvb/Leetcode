package neu.shravya.midterm;

public class PayPal implements iPaymentStrategy{

    private String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal : $" + String.valueOf(amount));
    }
}
