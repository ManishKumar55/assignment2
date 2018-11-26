// to check a no.is palidrome or not.....

import java.util.Scanner;
public class PalidromeEx{
	public static void main(String[] args)
	{
       

         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number");
        int  no = sc.nextInt();
         int temp=no;
         int rev= 0, rem;
         while(temp!=0)
         {

         rem = temp % 10;
         rev = rev * 10 + rem ;
         temp= temp/10;
         }
         if(no==rev)
         {
         	System.out.println("no is palidrome");
         }
         else{
         	System.out.println("no. is not palidrome");
         }

	}
}