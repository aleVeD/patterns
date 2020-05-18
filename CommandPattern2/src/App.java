public class App {

  public static void main(String[] args) {
    final Algoritm algoritm = new Algoritm();
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        algoritm.produce();
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        algoritm.consume();
      }
    });

    t1.start();
    t2.start();
  }
}
