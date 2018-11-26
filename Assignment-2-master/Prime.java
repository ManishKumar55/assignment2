//check if a number N is prime or not......

import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("value of a= ");
		int a= sc.nextInt();
         int count=0;
         for(int i=1;i<=a;i++)
         {
         	if(a%i==0)
         	{	
         		count++;
         	}
        } 	
         	if(count==2)
		{
			System.out.println("n is  a prime number");

		}
		else 
		{
			System.out.println("n is not a prime number");
		}
	}
}