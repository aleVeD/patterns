public class TurnOffCommand implements Command{
  Light li;

  public TurnOffCommand(Light li) {
    this.li = li;
  }

  @Override
  public void execute() {
    this.li.turnOff();
  }
}
