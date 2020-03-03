
public class ExceptionsTest {

	public static void main(String[] args) {

		
		System.out.println("in main");
		
		System.out.println(test());;
		

	}

	private static String test() {
		try {
			
			System.out.println("TRY : ExceptionsTest.main()");
			throw new Exception();
			//return "from try";
		}

		catch (Exception e) {
			System.out.println("CATCH : ExceptionsTest.main()");
			return "from catch";
		}
		
		finally {
			System.out.println("FINALLY : ExceptionsTest.main()");
			return "from finally";
		}		
	}

}
