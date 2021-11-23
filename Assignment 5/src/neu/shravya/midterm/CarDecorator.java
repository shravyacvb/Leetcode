package neu.shravya.midterm;

public class CarDecorator implements iCar{
    private iCar car;
    public CarDecorator(iCar car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
