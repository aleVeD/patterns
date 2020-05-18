import com.sun.scenario.effect.impl.state.AccessHelper;

public class CustomerFactory {

  private Database database;
  public CustomerFactory(){
    this.database = new Database();
  }

  public AbstractCustomer getCustomer(String name){
    if(checkName(name)){
      return new RealCustomer(name);
    }else{
      return new NullCustomer();
    }
  }

  private boolean checkName(String name) {
    if(database.existCustomer(name)){
      return true;
    }else{
      return false;
    }
  }
}
