
// Traversal of an array
public class arrayTraversal {
  public static void main(String[] args) {
    int[] numbers = new int[5]; // initialization of array with default values that is 0s here
    // Explanation:
    // int[] → declares an array of integers
    // numbers → the name of the array
    // new int[5] → allocates memory for 5 integer values (default value = 0)
    // here new keyword is used to allocate memory for the array

    // explicitly assigning values to each element of the array
    String[] names = { "Amit", "Shanmuk", "Kary", "Mike", "Jhonny" }; // Creates and initializes a String array called
                                                                      // 'names' with 5 elements
    // Explanation:
    // String[] → declares an array of Strings
    // names → the name of the array
    // { "Amit", "Shanmuk", "Kary", "Mike", "Jhonny" } → initializes the array with
    // these 5 values

    System.out.println("Numbers array: ");
    for (int i = 0; i < numbers.length; i++) {// Traversing the 'numbers' array using a for loop --> traveral means
                                              // accessing each element one by one
      System.out.println(numbers[i]);
    }

    System.out.println("Names array: ");
    for (int i = 0; i < names.length; i++) {// Traversing the 'names' array using a for loop
      System.out.println(names[i]);
    }
  }
}

// int[] numbers; // ✔️ Declaration --> This tells Java that numbers will be an
// array of integers.

// numbers = new int[5]; // ✔️ Memory Allocation --> This creates space in
// memory for 5 integers (all default to 0).

// int[] numbers = {1, 2, 3, 4, 5}; // initialization ✖️ Not Full Initialization
// --> Initialization means giving actual values to each element, like this:
// or
// numbers[0] = 10;
// numbers[1] = 20;

// So your line:
// int[] numbers = new int[5];

// ✔️ declares the array
// ✔️ allocates memory
// ✖️ does not fully initialize the elements (they are set to default 0)
