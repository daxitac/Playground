import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      sub(arr,n);
    }
  public  static void sub(int arr[],int n){
    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        for(int k=j+1;k<n;k++)
        {
          System.out.print("("+arr[i]+","+" "+arr[j]+","+" "+arr[k]+")"+" ");
        }
      }
      System.out.println();
    }
  }
}