//program

import java.util.Scanner;
public class array {
	public static void main(String[] args)
	{
		int a[] = new int[10]; // declaration 
		//accept array input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

/*
Output:

Enter size of array: 
10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10 

*/
