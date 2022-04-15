package day2;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("korea");
		System.out.println(s1);
		s1.append(" Town");
		System.out.println(s1);
		System.out.println(s1.insert(0,"Hai...."));
		s1.setCharAt(1, 'i');
		System.out.println(s1);

	}

}
