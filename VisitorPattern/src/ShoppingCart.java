public class ShoppingCart implements ShoppingCartVisitor{
  @Override
  public Double visit(Chair chair) {
    return chair.getPrice();
  }

  @Override
  public Double visit(Table table) {
    return table.getPrice();
  }
}
