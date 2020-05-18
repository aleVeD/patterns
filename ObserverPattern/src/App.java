public class App {
  public static void main(String[] args) {
    WeatherStation w = new WeatherStation();
    WeatherObserver we = new WeatherObserver(w);

    w.setHumidity(23);
    w.setPressure(5);
  }
}
