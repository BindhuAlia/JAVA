import java.util.Scanner;

public class Arr_eg {

	public static void main(String[] args) {
		int arr[],ans[],n,j=0;
		Scanner ob= new Scanner(System.in);
		n=ob.nextInt();
		arr=new int[n];
		ans=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ob.nextInt();
			if (arr[i]%2==0)
				{
					ans[j]=arr[i];
					j++;
				}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]+" ");
		}
		ob.close();
		

	}

}
