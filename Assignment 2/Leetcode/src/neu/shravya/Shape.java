package neu.shravya;

public class Shape {
    private String name;
    private String color;
    private int area;
    private int perimeter;

    public Shape(){}

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int perimeter, int area){
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public float getArea(){
        return area;
    }

    public void setArea(int area){
        this.area = area;
    }

    public float getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(int perimeter){
        this.perimeter = perimeter;
    }

    public String printShape(){
        return "The "+this.name+" has a "+this.color+" color";
    }
}
