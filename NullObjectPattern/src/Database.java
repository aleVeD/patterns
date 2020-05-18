import java.util.ArrayList;
import java.util.List;

public class Database {
  private List<String> customersNames;

  public Database() {
    this.customersNames = new ArrayList<>();
    this.customersNames.add("Juan");
    this.customersNames.add("Alexis");
    this.customersNames.add("Patricia");
    this.customersNames.add("Eleuterio");
  }

  public  Boolean existCustomer(String name){
    for(String s : customersNames){
      if(s.equals(name)){
        return true;
      }

    }
    return false;
  }
}
