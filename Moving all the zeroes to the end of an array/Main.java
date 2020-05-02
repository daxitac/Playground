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
      mov(arr,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
  public static void mov(int list[],int size)
  {
    int nw[]=new int[size];
    int nws=0;
    int ne[]=new int[size];
    int nes=0;
    for(int i=0;i<size;i++)
    {
      if(list[i]!=0)
      {
        nw[nws]=list[i];
        nws++;
      }
      else
      {
        ne[nes]=list[i];
        nes++;
      }
    }
    int arrs=0;
    for(int i=0;i<nws;i++)
    {
      list[arrs]=nw[i];
      arrs++;
    }
    for(int i=0;i<nes;i++)
    {
      list[arrs]=ne[i];
      arrs++;
    }
  }
}

