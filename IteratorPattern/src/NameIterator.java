public class NameIterator implements Iterator{
  private int index;
  private String[] names;

  public NameIterator(String[] names) {
    this.names = names;
  }

  @Override
  public boolean hasNext() {
    return index < this.names.length;
  }

  @Override
  public Object next() {
    if(hasNext()){
      return this.names[index++];
    }
    return null;
  }
}
