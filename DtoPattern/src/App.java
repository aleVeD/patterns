public class App {
  public static void main(String[] args) {
    Database d = new Database();
    d.insert(new Person("Ale", "f"));
    d.insert(new Person("Juan", "m"));
    d.insert(new Person("Claudia", "f"));
    for(Person p : d.getPeople()){
      System.out.println(p);
    }
  }
}
