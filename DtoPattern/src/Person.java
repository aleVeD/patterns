public class Person {
  private String name;
  private String address;
  private String gender;
  private int age;

  public Person(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
