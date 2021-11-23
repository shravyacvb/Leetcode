package neu.shravya.midterm;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(iCar car){
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }

}
