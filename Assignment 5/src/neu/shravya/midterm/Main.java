package neu.shravya.midterm;

public class Main {

    public static void main(String[] args) {

        System.out.println("Question 1");
        iCar sportsCar = new SportsCar(new BasicCar()); sportsCar.assemble();
        System.out.println();
        iCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println("\n\nQuestion 2");
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();


        System.out.println("\nQuestion 3");
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new PayPal("myemail@example.com"));
        cart.pay(new CreditCard( "1234567890123456"));

    }
}
