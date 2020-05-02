import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int l=n%10;
      int count;
      while(n>=10)
      {
        n=n/10;
      }
      count=l+n;
      System.out.println(count);
	}
}