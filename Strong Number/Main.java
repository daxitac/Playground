import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
	   int number = sc.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
          fac=1;
			int r = n % 10;
			for(int i=r ; i >= 1 ; i=i-1)
            {
              fac = fac * i;
            }
			sum = sum + fac;
			n=n/10;
		}
		if(sum == number)
			System.out.println("Yes");
		else
			System.out.println("No");  
    }
}