public class App {
  public static void main(String[] args) {
    Downloader.getInstance().startDownloading();

    SingletonClass.INSTANCE.setCounter(10);
    System.out.println(SingletonClass.INSTANCE.getCounter());
  }
}
