package neu.shravya.midterm;

public class ShapeMaker {

    public ShapeMaker(){

    }

    iShape circle = new Circle();
    iShape rectangle = new Rectangle();
    iShape square = new Square();

    public void drawCircle()
    {
        this.circle.draw();
    }

    public void drawRectangle()
    {
        this.rectangle.draw();
    }

    public void drawSquare()
    {
        this.square.draw();
    }

}
