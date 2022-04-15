package day2;

public class ExploreStrng {

	public static void main(String[] args) {
		String s="abc123#$%A5Z*";
		int sym=0;
		int upp=0;
		int low=0;
		int digi=0;
		char ch[]=s.toCharArray();
		
		/*for(int i=0;i<s.length();i++)
		{
			int a=ch[i];
			if(a>=65 && a<=90)upp++;
			else if(a>=48 && a<=57)digi++;
			else if(a>=97 && a<=122)low++;
			else sym++;
		}
		*/
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(ch[i]))upp++;
			else if(Character.isLowerCase(ch[i]))low++;
			else if(Character.isDigit(ch[i]))digi++;
			else sym++;
		}
		
		System.out.println("symbols:"+sym);
		System.out.println("uppercase letters:"+upp);
		System.out.println("lowercase letters:"+low);
		System.out.println("digits:"+digi);
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(ch[i]))sum+=(ch[i]-48);
		}
		System.out.println("sum of digits:"+sum);

	}

}
