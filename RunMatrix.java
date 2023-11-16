import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int size = scanner.nextInt();
    Matrix matrix = new Matrix(size);
    matrix.populateMatrix();
    System.out.println("Matrix with Populated Values:");
    matrix.printMatrix();
    matrix.flipMatrix();
    System.out.println("Flipped Matrix:");
    matrix.printMatrix();
  }
}
