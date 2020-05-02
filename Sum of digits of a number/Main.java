import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int count=0;
      int d;
      while(n>0)
      {
        d=n%10;
        count=count+d;
        n=n/10;
      }
      System.out.println(count);
	}
}