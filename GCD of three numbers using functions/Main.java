import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int min;
    if(a>b)
    {
      min=a;
    }
    else
    {
      min=b;
    }
    int s;
    if(a%min==0 && b%min==0)
    {
      s=min;
    }
    else
    {
      while(min>0)
      {
        if(a%min==0 && b%min==0)
        {
          s=min;
          break;
        }
        min--;
      }
    }
    return min;
  } 
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int h=gcd(n1,n2);
      int f=gcd(h,n3);
      System.out.println(f);
	}
}