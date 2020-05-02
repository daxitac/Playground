import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str1=in.nextLine();
      int str1_len=str1.length();
      int si=0;
      int ei=str1_len-1;
      boolean is=false;
      while(si<ei)
      {
        if(str1.charAt(si) == str1.charAt(ei))
        {
          is=true;
        }
        else
        {
          is=false;
          break;
        }
        si++;
        ei--;
      }
      if(is==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    } 
}
