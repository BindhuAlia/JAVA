import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String rno,name,branch;
		int marks;
		Scanner sc=new Scanner(System.in);
		rno=sc.next();
		name=sc.next();
		marks=sc.nextInt();
		sc.nextLine();//dummy call
		branch=sc.nextLine();
		System.out.println("Rno:"+rno);
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Marks:"+marks);
		sc.close();
	}

}
/*while reading using nextline immediately after nextInt it wont take
 *input cause the next line will read the space after integer so we have to call 
 *a dummy nextline so that the dummy will store space and our original nextLine()
 * can store our actual value
 */

/* output
 * 19A91A05J4
 * Eden
 * 98
 * CSE
 * Rno:19A91A05J4
 * Name:Eden
 * Branch:CSE
 * Marks:98
 */
