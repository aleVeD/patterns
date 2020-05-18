import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<ShoppingItem> items = new ArrayList<>();
    items.add(new Table("Madera", 34500.0));
    items.add(new Chair("madera", 2400.0));
    double sum = 0;
    ShoppingCartVisitor sc = new ShoppingCart();
    for(ShoppingItem shoppingItem : items){
      sum = sum + shoppingItem.accept(sc);
      System.out.println("sum = " + sum);
    }
  }
}
