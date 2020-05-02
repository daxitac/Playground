import java.util.Scanner;
class Main{
  public static int great(int a,int b)
  {
    int gr;
    if(a>b)
    {
      gr=a;
    }
    else
    {
      gr=b;
    }
    return gr;
  } 
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int h=great(n1,n2);
      int f=great(h,n3);
      System.out.println(f);
	}
}