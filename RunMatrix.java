import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create scanner for input
    System.out.print("Enter the size of the matrix: "); // Step 1
    int size = scanner.nextInt();
    Matrix matrix = new Matrix(size);
    matrix.populateMatrix(); // Step 2
    System.out.println("Matrix with Populated Values:");
    matrix.printMatrix(); // Step 3
    matrix.flipMatrix(); // Step 4
    System.out.println("Flipped Matrix:"); // Step 5
    matrix.printMatrix(); // Step 6
  }
}
