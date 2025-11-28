// Array Declaration and Initialization by index number
public class ArrayDeclaration {
  public static void main(String[] args) {
    int[] numbers; // declaration of the array
    numbers = new int[5]; // initialization of the array with default values or memory allocation // here
                          // 0s are assigned by default
    // initializing each element of the array or assigning values
    numbers[0] = 10; // assigning value to first element
    numbers[1] = 20; // assigning value to second element
    numbers[2] = 30; // assigning value to third element
    numbers[3] = 40; // assigning value to fourth element
    numbers[4] = 50; // assigning value to fifth element

    // print the array elemets using for loop
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

  }
}
