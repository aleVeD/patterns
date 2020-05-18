import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

  private int pressure;
  private int temperature;
  private int humidity;
  private List<Observer> list;

  public WeatherStation() {
    this.list = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer o) {
    this.list.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    this.list.remove(o);
  }

  @Override
  public void notifyAllObservers() {
    for(Observer os: this.list){
      os.update(pressure, temperature, humidity);
    }
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
    notifyAllObservers();
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    notifyAllObservers();
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
    notifyAllObservers();
  }
}
