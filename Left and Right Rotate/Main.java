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
      int r=in.nextInt();
    movl(arr,n,r);
    movr(arr,n,r);
    for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
  }
  public static void movl(int list[],int size,int ro)
  {
    int fevenin=1;
    int levenin;
    if(size%2==0)
    {
      levenin=size-1;
    }
    else
    {
      levenin=size-2;
    }
  for(int j=1;j<=ro;j++)
  {
    int temp=list[fevenin];
    for(int i=3;i<size;i=i+2)
    {
      list[i-2]=list[i];
    }
    list[levenin]=temp;
  }
}
  public static void movr(int list[],int size,int ro)
  {
    int foddin=0;
    int loddin;
    if(size%2==1)
    {
      loddin=size-1;
    }
    else
    {
      loddin=size-2;
    }
  for(int i=1;i<=ro;i++)
  {
    int temp=list[loddin];
    for(int j=(loddin-2);j>=0;j=j-2)
    {
      list[j+2]=list[j];
    }
    list[foddin]=temp;
  }
  }
}
