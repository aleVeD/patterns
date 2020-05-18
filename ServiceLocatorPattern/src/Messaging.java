public class Messaging implements Service{

  public static final String NAME = "databaseMessaging";
  @Override
  public String getName() {
    return Messaging.NAME;
  }

  @Override
  public void execute() {
    System.out.println("exeuting messaging");
  }
}
