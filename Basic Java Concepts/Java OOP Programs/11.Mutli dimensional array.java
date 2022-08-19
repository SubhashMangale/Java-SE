import java.util.Scanner;
public class array {
	public static void main(String[] args)
	{
		//accept array input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row of array: ");
		int n = sc.nextInt();
		System.out.println("Enter column of array: ");
		int m = sc.nextInt();
		
		int a[][] = new int[n][m]; // declaration 
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
