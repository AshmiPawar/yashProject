package stringExample;

public class stringExample {

	
	public static void main(String[] args) {
		String s1 = "abc";
		final String s2 = s1;
		String[] arr = new String[]{"abc","pqr"};
		System.out.println(arr[0]);
		m1(arr);
System.out.println(arr[0]);		
//		System.out.println("s1 = "+ s1.hashCode() +" s2 = "+ s2.hashCode());
//
//		s1 = " xyz";
//  
//		
//		System.out.println("s1 = "+ s1 +" s2 = "+ s2);
//		System.out.println("s1 = "+ s1.hashCode() +" s2 = "+ s2.hashCode());
	}

	private static void m1(String[] arr) {

		 arr = new String[] {"xyz"};
		
	}
}
