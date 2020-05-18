public class App {
  public static void main(String[] args) {
    Thread hilo = new Proceso("primer proceso");
    Thread hilo2 = new Proceso("segundo proceso");
    Thread hilo3 = new Proceso("tercer proceso");
    hilo.start();
    hilo2.start();
    hilo3.start();
    Switcher s = new Switcher();
    Light li = new Light();
    TurnOnCommand onCommand = new TurnOnCommand(li);
    TurnOffCommand offCommand = new TurnOffCommand(li);
    s.addCommand(onCommand);
    s.addCommand(offCommand);
    s.executeCommands();
  }
}
