package neu.shravya.midterm;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> itemList = new ArrayList<>();

    public ShoppingCart(){

    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item)
    {
        itemList.remove(item);
    }

    public int calculateTotal()
    {
        int total = 0;
        for (Item item : this.itemList)
        {
            total += item.getPrice();
        }

        return total;
    }

    public void pay(iPaymentStrategy paymentStrategy)
    {
        int total = this.calculateTotal();
        paymentStrategy.pay(total);
    }

}
