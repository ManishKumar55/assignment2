import java.util.*;
public class SecLargArr
{
	public static void main(String[] args) {
		System.out.println("enter the elements = ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i =0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length ; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

			if(i==1)
			{
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	  
	  System.out.println("enter second largest element= " + arr[1]);
	}
}