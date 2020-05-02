import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      //StringBuilder sb=new StringBuilder(str);
      int str_len=str.length();
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<str_len;i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
           {
             int n=str.charAt(i)-'a';
          arr[n]++;
        }
        if(str.charAt(i)>='A' && str.charAt(i)<='Z')
           {
             int n=str.charAt(i)-'A';
          arr[n]++;
        }
      }
        for(int k=0;k<26;k++)
        {
          if(arr[k]==0)
          {
            char a=(char)(k+'a');
            System.out.print(a+" ");
          }
        }
    }
}

 