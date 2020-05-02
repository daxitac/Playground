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
    int flag=0;
    int bs=list[0]+list[1]+list[2];
    for(int i=3;i<size;i=i+3)
    {
      int cbs=list[i]+list[i+1]+list[i+2];
    if(cbs!=bs)
    {
      flag=0;
    }
      else
      {
        flag=1;
      }
    }
    if(flag==1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}
