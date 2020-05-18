public class NameRepository {
  private String[] names = {"Luisa", "Bernardita", "Clemente"};

  public Iterator getIterator(){
    return new NameIterator(names);
  }
}
