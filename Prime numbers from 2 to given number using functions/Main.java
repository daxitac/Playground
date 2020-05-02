import java.util.Scanner;
class Main{
  public static int power(int a)
  {
    int fact=0;
    for(int i=2;i<=a/2;i++)
    {
      if(a%i==0)
      {
        fact=fact+1;
      }
    }
    return fact;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int s=2;
      while(s<=n)
      {
        int c = power(s);
        if(c==0)
        {
          System.out.println(s);
        }
        s=s+1;
      }
	}
}