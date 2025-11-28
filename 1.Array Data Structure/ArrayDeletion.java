public class ArrayDeletion {
  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int deleteIndex = 2;

    // shift element to the left side
    for (int i = deleteIndex; i < numbers.length - 1; i++) {
      numbers[i] = numbers[i + 1]; // assigning the next value to the current index
    }
    numbers[numbers.length - 1] = 0; // optional: set the last element to 0 after deletion

    // print the updated array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
