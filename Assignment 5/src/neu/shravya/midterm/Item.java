package neu.shravya.midterm;

public class Item {
    public String Id;
    public int price;

    public Item(String id, int price){
        this.Id = id;
        this.price = price;
    }

    public String getId(){
        return this.Id;
    }

    public int getPrice(){
        return this.price;
    }
}
