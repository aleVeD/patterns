public class Downloader {

  //eager version
  private static Downloader downloader = new Downloader();
  //lazy version
  //private static Downloader downloader;

  private Downloader(){

  }

  public void startDownloading(){
    System.out.println("start download");
  }

  public static Downloader getInstance(){

    //lazy version
    /*
    if(downloader == null){
      downloader = new Download();
    }
    return Downloader.downloader;
     */
    return Downloader.downloader;
  }
}
