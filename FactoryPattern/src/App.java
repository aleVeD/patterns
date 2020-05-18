public class App {
  public static void main(String[] args) {
    Algorithm algorithm = AlgorithmFactory.create(AlgorithmFactory.SHORTEST);
    algorithm.solve();
  }
}
