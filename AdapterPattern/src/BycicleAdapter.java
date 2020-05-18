public class BycicleAdapter implements Vehicle{

  private Bicicle bicicle;

  public BycicleAdapter(Bicicle bicicle) {
    this.bicicle = bicicle;
  }

  @Override
  public void acelerate() {
    System.out.println("bici is acelerating");
  }
}
