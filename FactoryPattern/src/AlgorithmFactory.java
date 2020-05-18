public class AlgorithmFactory {

  public static final int SHORTEST = 0;
  public static final int SPANNING = 1;

  public static Algorithm create(int type){
    switch (type) {
      case SHORTEST:
        return new ShortestPath();
      case SPANNING:
        return new SpanningTree();
      default:
        return null;
    }
  }
}
