package neu.shravya;

public class Main {

    public static void main(String[] args) {

        //Question 1
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
        System.out.println();

        //Question 2
        Psychiatrist psychiatristObject = new Psychiatrist();
        Moody moodyObject = new Happy();
        Moody moodyObject1 = new Sad();

        psychiatristObject.examine(moodyObject);
        psychiatristObject.observe(moodyObject);
        System.out.println();
        psychiatristObject.examine(moodyObject1);
        psychiatristObject.observe(moodyObject1);

    }
}
