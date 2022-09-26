import java.util.*;
import java.io.*;
class MatrixDiagonalSum {
  public static void main(String args[]) {
    int a[][] = new int[5][5], j, i, m, n, sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the  row size and column size of  matrix :");
    m = s.nextInt();
    n = s.nextInt();
    if (m == n) { //we can find the sum only if it is a square Matrix
      System.out.println("Enter the Elements of  matrix :");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++)
          a[i][j] = s.nextInt();
      }

      System.out.println("The matrix in matrix fromat is");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          System.out.print(a[i][j] + "\t");
          if (i == j) //condtion for diagonal element i and j should be same
            sum = sum + a[i][j];
        }
        System.out.println();
      }
      System.out.println(" Sum of Diagonals is  " + sum);
    } else
      System.out.println(" Not a square matrix can't find sum of Diagonals");
  }

}
