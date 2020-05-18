public class App {
  public static void main(String[] args) {
    Person person = new Person.Builder("Juan", "juan@gmail.com").setAge(34).build();
    System.out.println(person);
    
  }
}
