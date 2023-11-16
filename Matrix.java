public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {
    matrix = new int[size][size];
    System.out.println("Matrix dimensions: " + size + " x " + size);
  }
}
