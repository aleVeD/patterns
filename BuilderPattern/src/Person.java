public class Person {

  private String name;
  private String email;
  private String address;
  private int age;

  public Person(Builder builder) {
    this.address = builder.address;
    this.name = builder.name;
    this.email = builder.email;
    this.age = builder.age;

  }

  public static class Builder{
    private final String name;
    private final String email;
    private  String address;
    private  int age;

    public Builder(String name, String email) {
      this.name = name;
      this.email = email;
    }

    public Builder setAddress(String address){
      this.address = address;
      return this;
    }

    public Builder setAge(int age){
      this.age = age;
      return this;
    }

    public Person build(){
      return new Person(this);

    }
  }
@Override
  public String toString(){
    return this.age+" "+this.email+" "+ this.name;
  }

}

