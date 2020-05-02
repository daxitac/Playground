import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=0;
      int sum=0;
      int t;
      t=n;
      while(n>0)
      {
        int i=n%10;
        sum=sum+i*i*i;
        n=n/10;        
      }
      if(sum==t)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}