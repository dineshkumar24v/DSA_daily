public class ArrayInsertion {
  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 }; // initial array with 5 elements

    int insertIndex = 2; // the index at which we want to insert the value
    int insertValue = 25; // the value to be inserted

    // shifting elements to the right
    for (int i = numbers.length - 1; i > insertIndex; i--) {
      numbers[i] = numbers[i - 1]; // assigning the previous value to the current index
    }
    // inserting the value at the specified index
    numbers[insertIndex] = insertValue;

    // print the updated array
    for (int i = 0; i <= numbers.length; i++) {
      System.out.println(numbers[i]);
    }

  }
}
