public class ArrayLengthBoundChecking {
  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };
    int x = numbers.length; // length of the array
    // prints the length of the array
    System.out.println("length of the array : " + x); // prints 5

    System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException because valid indices are 0 to 4
  }
}
