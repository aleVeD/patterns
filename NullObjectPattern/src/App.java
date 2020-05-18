public class App {
  public static void main(String[] args) {
    CustomerFactory cf = new CustomerFactory();
    System.out.println(cf.getCustomer("Alexis").getCustomer());
  }
}
