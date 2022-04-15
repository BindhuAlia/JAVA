package day2;

public class Strng {

	public static void main(String[] args) {
		String s= new String("korea");
		System.out.println(s);
		//s.concat(" Town");--fails to concat 
		//1st korea is created and is assigned to s but when we performed concate
		//a ob will be created as korea town and it isnt referenced by s
		//so we need to update it by assigning it to s
		s=s.concat(" Town");
		System.out.println(s);
		
		
		StringBuffer s1= new StringBuffer("korea");
		System.out.println(s1);
		s1.append(" Town");
		System.out.println(s1);
		
		

	}

}
