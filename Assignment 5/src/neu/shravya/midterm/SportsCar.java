package neu.shravya.midterm;

public class SportsCar extends CarDecorator{

    public SportsCar(iCar car)
    {
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.print("Adding features of Sports Car. ");
    }

}
