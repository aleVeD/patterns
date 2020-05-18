public class ServiceDatabase implements Service{

  public static final String NAME = "databaseService";



  @Override
  public String getName() {
    return ServiceDatabase.NAME;
  }

  @Override
  public void execute() {
    System.out.println("executing database service");
  }
}
