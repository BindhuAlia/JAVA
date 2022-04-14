import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		int p,t,r;
		Scanner ob = new Scanner(System.in);
		System.out.println("enter p");
		p=ob.nextInt();
		System.out.println("enter t");
		t=ob.nextInt();
		System.out.println("enter r");
		r=ob.nextInt();
		float SI;
		SI=(p*t*r)/100;
		System.out.println("Simple interest is:"+ SI);

	}

}
