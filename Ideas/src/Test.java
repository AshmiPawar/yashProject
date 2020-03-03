import java.util.HashMap;
import java.util.Map;

//class A{
//	public void printStuff(){
//		System.out.println("A.printStuff()");
//	}
//}

class B extends Test{
	public void printStuff(){
		super.printStuff();
		System.out.println("B.printStuff()");
	}
}



public class Test {
	public void printStuff(){
		System.out.println("A.printStuff()");
	}
	
	
	public static void countAlpha(String str) {
		char[] chars = str.toCharArray();
		Map<Character,Integer> mapCount = new HashMap<>();
		for(char ch : chars) {
			mapCount.put(ch, 0);
		}

		System.out.println(mapCount);

		for(char ch : chars) {
			if(mapCount.containsKey(ch)) {
				mapCount.put(ch, mapCount.get(ch)+1);
			}
		}
		
		System.out.println(mapCount);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Test t = new B();
		t.printStuff();
		countAlpha("ashmiPawar");
		//foo();
//     C c = new C ();
//    System.out.println(c.createX("x1").f()); ;
	}

}



interface X {
    String f();
}
class X1 implements X {
    @Override
    public String f() {
           return "x1";
    }
}
class X2 implements X {
    @Override
    public String f() {
           return "x2";
    }
}
class C {
    public static X createX (String itype) {
    if (itype.equalsIgnoreCase ("X1")){
           return new X1();
    } else if(itype.equalsIgnoreCase ("X2")){
           return new X2();
    } else {
        throw new IllegalArgumentException("No such type");
    }
}
}