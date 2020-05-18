public class TurnOnCommand implements Command{
  private Light li;

  public TurnOnCommand(Light li) {
    this.li = li;
  }

  @Override
  public void execute() {
    this.li.turnedOn();
  }
}
