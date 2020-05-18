public class App {
  public static void main(String[] args) {
    int[] numbers = {1,5,2,8,3,6,23,36,84,75};
    Algorithm sortIn = new InsertionSOrt(numbers);
    sortIn.sort();
    Algorithm sortAlgorothm = new BubbleSort(numbers);
    sortAlgorothm.sort();
  }
}
