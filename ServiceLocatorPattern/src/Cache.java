import java.util.ArrayList;
import java.util.List;

public class Cache {

  private List<Service> list;

  public Cache() {
    this.list = new ArrayList<>();
  }

  public Service getService(String jndiName){
    for(Service s : list){
      if(s.getName().equals(jndiName)){
        return s;
      }
    }
    return null;
  }

  public void addService(Service service){
    this.list.add(service);
  }
}
