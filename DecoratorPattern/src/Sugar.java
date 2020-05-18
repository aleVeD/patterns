public class Sugar extends BeverageDecorator {
  public Sugar(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return this.beverage.getCost() + 1000;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + " sugar";
  }
}
