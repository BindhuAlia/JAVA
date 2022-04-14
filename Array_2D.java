import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		int n;
		int mat[][]={{1,2,3,4},{2,3,4,3},{2,4,5,2},{2,3,4,6}},l=0,r=0;
		Scanner ob = new Scanner(System.in);
		n=ob.nextInt();
		int k=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		//abs diff of diagonal elements
		for(int i=0;i<n;i++)
		{
			l+=mat[i][i];
			r+=mat[k][i];
			k--;
		}
		System.out.println(Math.abs(l-r));
		ob.close();
		
			
	}

}
