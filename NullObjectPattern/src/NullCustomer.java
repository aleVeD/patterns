public class NullCustomer extends AbstractCustomer{
  @Override
  public Boolean isNull() {
    return true;
  }

  @Override
  public String getCustomer() {
    return "not exists";
  }
}
