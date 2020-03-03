class Parent {
	private int a = 10;
	public int b = 10;

	protected void check(Integer a) {
		System.out.println("Parent.check()");
	}
	
	
	
}

class Child extends Parent {
	private int a = 20;
	private int b = 20;

	public void check(int a) {
		System.out.println("Child.check()");
	}

}

public class Casting {
	
	private Casting() {
		
	}

	public Class[] getAll() {
		Class c = java.util.TreeMap.class;
		c.getDecl
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class cls = Class.forName("Casting");
		Casting c = (Casting) cls.newInstance();
		System.out.println(c.getClass().getName());
//		Child c = (Child) new Parent();
//		int n = 2;
//		// int[][] arr = { { 5, 10 } };
//
//		int[][] arr = { { 5, 10 }, { 8, 12 } };
//
//		// streeet light 1: 10 - 5 = 5
//		// street light 2: 12 - 8 = 4
//		// common regon : 10 - 8 = 2
//		// total = 5 + 4 -2
//		int test = streetLight(n, arr);
//
//		System.out.println("test" + test);

//		String str1 = "abc";
//		String str2 = new String("abc");
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		
//		Parent p = new Child();
//		p.check(20);
	}

	private static int streetLight(int n, int[][] arr) {
		
		
		
		int str[] = { 0, 0 };
		int sum = 0;
		int comreg = 0;
		if (n == 1)
			return arr[0][1] - arr[0][0];
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n - 1; j++) {
				str[i] = arr[i][j + 1] - arr[i][j];
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				comreg = arr[i][j + 1] - arr[i + 1][j];
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			sum += str[i];
		}
		return sum - comreg;

	}
}

//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Stack;
//
////import javax.swing.Box;
//
//public class Casting {
//	
//	final int a = 0;
//	final int c = 0;
//	int  d;
//
//	public int getD() {
//		return d;
//	}
//
//	public void setD(int d) {
//		this.d = d;
//	}
//
//	public int getA() {
//		return a;
//	}
//
//	public int getC() {
//		return c;
//	}
//
//	public static void main(String args[]) {
//		
//		Rectangle r = new Circle();
//				
//		
//	
//	//	s.draw();
//		
////		Rectangle rr = new Circle();
////		Circle c = (Circle) rr;
////		c.draw();
//		
////			s = new Circle();
////			s.draw();
//		
//		
////		LinkedList<Box> listBox=new LinkedList<>();
////		Stack<Box> anotherBoxList=new Stack<>();
////		Box a=new Box(5.1f,"India");
////		Box b=new Box(3.7f,"Japan");
////		Box c1=new Box(8.2f,"Thailand");
////		
////		
////		listBox.add(a);listBox.add(b);listBox.add(c1);
////		anotherBoxList.add(a);anotherBoxList.add(b);anotherBoxList.add(c1);
////		System.out.println(listBox.poll().equals(anotherBoxList.pop()));
//		
//
//	}
//	
//	
//	
//}
//interface Shape {
//	
//	void draw(); 
//}
//
//class Rectangle implements Shape {
//	 int a = 10;
//	public Rectangle() {
//		System.out.println("Rectangle.Rectangle()");
//	}
//
//	public void draw() {
//		System.out.println("drawing rectangle...");
//	}
//	private void check() {
//		System.out.println("Rectangle.check()");
//	}
//}
//
//class Circle extends Rectangle {
//	 int a =20;
//	public Circle() {
//		System.out.println("Circle.Circle()");
//	}
//
//	public void draw() {
//		System.out.println("drawing circle...");
//	}
//	private  void check() {
//		System.out.println("Circle.check()");
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////class Box{
////	private float f;
////	private String string;
////	public Box(float f, String string) {
////		
////		
//
//
////		this.f=f;
////		this.string=string;
////		// TODO Auto-generated constructor stub
////	}
////	public float getF() {
////		return f;
////	}
////	public void setF(float f) {
////		this.f = f;
////	}
////	public String getString() {
////		return string;
////	}
////	public void setString(String string) {
////		this.string = string;
////	}
////	
////	
////}
//
