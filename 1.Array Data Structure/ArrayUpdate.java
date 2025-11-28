//  Updating elements in any array
public class ArrayUpdate {
  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };

    // print the element at index 2 before update
    System.out.println("Element at index 2 is: " + numbers[2]);
    numbers[2] = 35; // updating number at index 2

    // print the updated array
    System.out.println("updated array");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

  }
}
