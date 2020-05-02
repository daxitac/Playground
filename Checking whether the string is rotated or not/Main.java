import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    int str1_len=str1.length();
    int str2_len=str2.length();
    String str3=str1.concat(str1);
    int str3_len=str3.length();
    int t=0;
    for(int i=0;i<str3_len-str2_len+1;i++)
    {
        boolean is=true;
      for(int j=0;j<str2_len;j++)
      {
        if(str3.charAt(i+j)!=str2.charAt(j))
      {
      is=false;
      }
    }
    if(is==true)
    {
    t=i;
    }
    }
    if(t!=0)
       {
         System.out.println("Yes");
       }
    else
    {
      System.out.println("No");
    }
  }
}