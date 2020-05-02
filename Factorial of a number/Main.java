import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f=1;
      while(n>0)
      {
        f=f*n;
        n=n-1;
      }
      System.out.println(f);
	}
}