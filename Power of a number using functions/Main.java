import java.util.Scanner;
class Main{
  public static int power(int a,int b)
  {
    int s=1;
    for(int i=1;i<=b;i++)
    {
      s=s*a;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int ba=in.nextInt();
      int ex=in.nextInt();
     System.out.println(power(ba,ex)); 
    }
}