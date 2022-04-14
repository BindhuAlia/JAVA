import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		int n,j=0,k=0;
		Scanner ob = new Scanner(System.in);
		n=ob.nextInt();
		int arr[]=new int[n];
		int even[]=new int[n];
		int odd[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ob.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				{
					even[j]=arr[i];
					j++;
				}
			else 
				{
					odd[k]=arr[i];
					k++;
				}
		}
		for(int i=0;i<j;i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		for(int i=0;i<k;i++)
		{
			System.out.print(odd[i]+" ");
		}
		ob.close();

	}

}
