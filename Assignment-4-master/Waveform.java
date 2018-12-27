import java.util.*;
class Waveform{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the 10 elements in array: ");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			if(i%2==0){
				System.out.print(a[i+1]+" "+a[i]+" ");
			}
		}
		
	}
}
		










	


