import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    int matrix2[][]=new int[column_size][row_size];
    for(int i = 0; i < row_size; i++)
    {
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<column_size;j++)
      {
        matrix2[j][i]=matrix1[i][j];
      }
    }
    for(int i = 0; i < row_size; i++)
    {
      for(int j = 0; j < column_size; j++)
      {
        System.out.print(matrix2[j][i]+" ");
      }
      System.out.println();
    }
  }
}