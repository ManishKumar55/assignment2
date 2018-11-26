//given three numbers. find out the biggest out of three numbers ....


import java.util.*;
import java.util.Scanner;
public class Biggestno
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		c=sc.nextInt();

        if(a>b && a>c)
        {
        	System.out.println("greater value is =" + a);
        }
        else if(b>c)
        { 
        	System.out.println("the greatest value is = " +b);
        }
        else
        {
        	System.out.println("greatest value is = "+ c);
        }


        

	}
}