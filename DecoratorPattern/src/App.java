public class App {
  public static void main(String[] args) {
    Beverage b = new Sugar(new Milk(new PlainBeverage()));
    System.out.println(b.getCost());
    System.out.println(b.getDescription());
  }


}
