public class Chair implements ShoppingItem{

  private String type;
  private Double price;

  public Chair(String type, Double price) {
    this.type = type;
    this.price = price;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public Double accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
