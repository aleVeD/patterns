public class InsertionSOrt extends Algorithm{

  private int[] numbers;

  public InsertionSOrt(int[] numbers) {
    this.numbers = numbers;
  }

  @Override
  public void initialize() {
    System.out.println("initializing insertion");
  }

  @Override
  public void sorting() {
    int j;
    int temp;
    for(int i = 0; i < this.numbers.length; i++){
      temp = this.numbers[i];
      j = i;
      while(j > 0 && numbers[i-1] > temp){
        numbers[j] = numbers[j-1];
        j = j-1;
      }
      numbers[j] = temp;
    }
  }

  @Override
  public void printResult() {
    for (int i = 0; i < numbers.length; i++){
      System.out.println(numbers[i]+ " ");
    }
  }
}
