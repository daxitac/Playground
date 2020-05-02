import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    batch(arr,n);
  }
  public static void batch(int list[],int size)
  {
    int max;
   if(list[0]>list[1]) 
   {
     max=0;
   }
    else
    {
      max=1;
    }
    for(int i=2;i<size;i++)
    {
      if(list[max]<list[i])
      {
        max=i;
      }
    }
    System.out.println(max);
  }
}