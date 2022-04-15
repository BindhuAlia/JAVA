package day2;

public class St_methods {

	public static void main(String[] args) {
		String s =  new String("live laugh love");
		//length
		int l=s.length();
		System.out.println(l);
		
		//concat
		s=s.concat(" chill");
		System.out.println(s);
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//split
		String words[]=s.split(" ");
		for(String word:words)
			System.out.print(word+" ");
		
		//equals
		String s1=new String("KOREA");
		String s2=new String("korea");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//replace
		System.out.println(s.replace('l','L'));
		System.out.println(s.replace("laugh","Smile"));
		
		//to get count of a particular char
		String s3="aditya";
		System.out.println(s3.length()-s3.replace("a", "").length());
		
		for(int i=0;i<s3.length();i++)
			System.out.print(s3.charAt(i)+" ");
		System.out.println();
		
		//index
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.lastIndexOf('a'));//starts checking from last
		
		//substring
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(0,5));
		
		//char array
		char x[]=s3.toCharArray();
		for(char ch:x)
			System.out.print(ch+" ");
		
		String s4=new String (x);
		System.out.println(s4);
		

	}

}
