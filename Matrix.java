public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {
    matrix = new int[size][size]; // Create new matrix from size input
    System.out.println("Matrix dimensions: " + size + " x " + size);
  }

  // Swap method switches values at 2 given coordinates
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1]; // Temporary variable to store value as it's being swapped
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  // Prints matrix to terminal and highlights diagonal
  public void printMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (row + column == matrix.length - 1) {
          System.out.print("\033[33m" + matrix[row][column] + "\t\033[0m"); // Print diagonal highlighted
        } else {
          System.out.print(matrix[row][column] + "\t"); // Print rest of matrix normally
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  // Populate matrix
  public void populateMatrix() {
    int count = 1;
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        matrix[row][column] = count++; // Next cell always has +1 value
      }
    }
  }

  // Transpose matrix
  public void flipMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (row + column < matrix.length - 1) {
          swap(row, column, matrix.length - 1 - column, matrix.length - 1 - row);
        }
      }
    }
  }
}
