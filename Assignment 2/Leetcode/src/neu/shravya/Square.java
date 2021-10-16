package neu.shravya;

//Inherits Shape
public class Square extends Shape {
    private int side;

    public Square(int side){
        this.side = side;
        this.setPerimeter(4 * this.side);
        this.setArea(this.side * this.side);
    }

    public Square(String name, String color, int side){
        super(name,color);
        this.side = side;
        this.setPerimeter(4 * this.side);
        this.setArea(this.side * this.side);
    }

    public float getSide(){
        return side;
    }

    public void setSide(int side){
        this.side = side;
    }
}
