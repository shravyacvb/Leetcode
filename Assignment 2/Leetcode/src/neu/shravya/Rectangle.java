package neu.shravya;

//Inherits Shape
public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int side){
        this.width = this.height = side;
        this.setPerimeter(2*(this.width + this.height));
        this.setArea(this.width * this.height);
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        this.setPerimeter(2*(this.width + this.height));
        this.setArea(this.width * this.height);
    }

    public Rectangle(String name, String color, int width, int height){
        super(name,color);
        this.width = width;
        this.height = height;
        this.setPerimeter(2*(this.width + this.height));
        this.setArea(this.width * this.height);
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

}
