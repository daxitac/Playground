import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]= new int[size];
       for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int larg;
      if(arr[0]>arr[1])
      {
        larg=arr[0];
      }
      else
      {
        larg=arr[1];
      }
      for(int j=1;j<size;j++)
      {
        if(larg<=arr[j])
        {
          larg=arr[j];
        }
      }
      System.out.println(larg);
    }
}