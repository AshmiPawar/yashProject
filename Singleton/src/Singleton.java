
public class Singleton {

	public static void main(String[] args) {
		System.out.println("Singleton.main()");
		System.out.println(Check.getInstance().hashCode());
		System.out.println(Check.getInstance().hashCode());
		System.out.println(Check.getInstance().hashCode());
		System.out.println(Check.getInstance().hashCode());
		
	}
	

}

class Check{
private static final Check instance = new Check();
	
	private Check() {
		
	}
	
	public static Check getInstance() {
		return instance;
	}
}