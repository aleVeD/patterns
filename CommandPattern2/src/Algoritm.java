import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algoritm {
  private BlockingQueue<Command> listCommand;

  public Algoritm() {
    //realiza 10 tareas al mismo tiempo
    listCommand = new ArrayBlockingQueue<>(10);
  }

  //produce tareas
  public void produce(){
    try {
      for(int i = 0; i < 10; i++){
        listCommand.put(new TaskSolver(new Task(i +1)));
      }

    }catch (InterruptedException e){
      e.printStackTrace();
    }
  }

  //consume tareas
  public void consume(){
    try {
      for(int i = 0; i < 10; i++){
        Thread.sleep(1000);
        listCommand.take().execute();
      }


    }catch (InterruptedException e){
      e.printStackTrace();
    }
  }
}
