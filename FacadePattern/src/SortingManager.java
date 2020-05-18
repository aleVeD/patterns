public class SortingManager {
  private Algorithm bubleSort;
  private Algorithm mergeSort;
  private Algorithm quickSort;

  public SortingManager() {
    this.bubleSort = new BubleSort();
    this.mergeSort = new MergeSort();
    this.quickSort = new QuickSort();

  }

public void doBubleSort(){
    this.bubleSort.sort();
}
public void doMergeSort(){
    this.mergeSort.sort();
}

public void doQuicksort(){
    this.quickSort.sort();
}
}
