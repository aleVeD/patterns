public class InitialContext {
  public Object lokup(String jdni){
    switch (jdni) {
      case ServiceDatabase.NAME:
        return new ServiceDatabase();
      case Messaging.NAME:
        return new Messaging();
      default:
        return null;
    }
  }
}
