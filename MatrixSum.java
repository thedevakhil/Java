import java.util.*;
import java.io.*;
class MatrixSum {
  public static void main(String args[]) {
    int a[][] = new int[5][5], j, i, m1, n1, b[][] = new int[5][5], m2, n2;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the  row size and column size of 1st  matrix :");
    m1 = s.nextInt();
    n1 = s.nextInt();
    System.out.println("Enter the  row size and column size of 2nd matrix :");
    m2 = s.nextInt();
    n2 = s.nextInt();
    if (m1 == m2 && n1 == n2) //condtion for matrix sum row and column size of both matrix should be same
    {
      System.out.println("Enter the Elements of 1st matrix :");
      for (i = 0; i < m1; i++) {
        for (j = 0; j < n1; j++)
          a[i][j] = s.nextInt();
      }

      System.out.println("Enter the Elements of 2nd matrix :");
      for (i = 0; i < m2; i++) {
        for (j = 0; j < n2; j++)
          b[i][j] = s.nextInt();
      }

      System.out.println("The 1st  matrix is");
      for (i = 0; i < m1; i++) {
        for (j = 0; j < n1; j++) {
          System.out.print(a[i][j] + "\t");
        }
        System.out.println();
      }
      System.out.println("The 2nd  matrix is");
      for (i = 0; i < m2; i++) {
        for (j = 0; j < n2; j++) {

          System.out.print(b[i][j] + "\t");
        }
        System.out.println();
      }
      System.out.println("Sum of  matrix is");
      for (i = 0; i < m1; i++) {
        for (j = 0; j < n1; j++) {

          System.out.print(a[i][j] + b[i][j] + "\t"); //just printing the sum not storing to a new array
        }
        System.out.println();
      }
    } else
      System.out.println("Matrix Addition Not Possible");
  }

}
