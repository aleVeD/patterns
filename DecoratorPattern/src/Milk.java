public class Milk extends BeverageDecorator{
  public Milk(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return this.beverage.getCost() + 3000;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " milk ";
  }
}
