import java.util.Scanner;

public class JagArr {

	public static void main(String[] args) {
		int x[][]=new int[5][];
		Scanner ob=new Scanner(System.in);
		x[0]= new int[4];
		x[1]= new int[3];
		x[2]= new int[1];
		x[3]= new int[2];
		x[4]= new int[3];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=ob.nextInt();
			}
		}
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		ob.close();
	}

}
