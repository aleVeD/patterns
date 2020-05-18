public class App {

  public static void main(String[] args) {
    Vehicle bus = new Bus();
    Vehicle car = new Car();
    Vehicle bici = new BycicleAdapter(new Bicicle());
    bici.acelerate();
    car.acelerate();
    bus.acelerate();
  }
}
