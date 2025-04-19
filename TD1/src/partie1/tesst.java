package partie1;

public class tesst {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = new String("abc");
		System.out.println(s1 == s);
		System.out.println(s1.equals(s));
		
		System.out.println("====================");
		
		s1 = "abc";
		System.out.println(s1 == s);
		System.out.println(s1.equals(s));
		
		

	}

}
