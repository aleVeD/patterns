public class ServiceLocator {
  private static Cache cache = new Cache();
  public static Service getService(String jdniName){
    Service service = cache.getService(jdniName);
    if(service != null) return service;
    InitialContext context = new InitialContext();
    Service s = (Service) context.lokup(jdniName);
    cache.addService(s);
    return s;
  }
}
