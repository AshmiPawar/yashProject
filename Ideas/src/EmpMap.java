import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpMap {

	public static void main(String[] args) {

		HashMap<Employee,Integer> map = new HashMap<Employee,Integer>(); 
		
		//Employee e1 = new Employee(11,2000,"abcd"); 
		map.put(new Employee(11,2000,"abcd"),1);
		
		map.put(new Employee(11,2000,"abcd"),2);
		//map.put(new Employee(12,2000,"abcd"),2);
		
		System.out.println("=============="+map.get(new Employee(11,2000,"abcd")));
		System.out.println(map.size());
//		System.out.println(map);
//		e1.age = 33;
//		//map.put(e1, 2);
//		System.out.println(map);
//		System.out.println(map.get(e1));
//		
//		List<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee(11,2000,"abcd"));
//		list.add(new Employee(88,2000,"bcda"));
//		list.add(new Employee(99,2000,"cdaa"));
//		list.add(new Employee(55,2000,"sdfj"));
//		list.add(new Employee(33,2000,"rjhg"));
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		map.put(new Employee(11,2000,"abcd"),2);
//		map.put(new Employee(14,2000,"abcd"),3);
//		map.put(new Employee(15,2000,"abcd"),4);
		
		//System.out.println(map);
	}

}

class Employee implements Comparable<Employee>{
	int age;
	int sal;
	String name;

	public Employee(int i, int j, String string) {

		 this.age = i;
		 this.name = string;
		 this.sal = j;
	
	}

	@Override
	public int hashCode() {
		
		System.out.println("In my hashcode::::::::::");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sal;
		System.out.println("in my hashCode():"+result);
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		
		String str = "abc";
		char[] s = str.toCharArray();
		s.
		System.out.println("In my equals:::::::::");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		System.out.println(getClass());
		System.out.println(obj.getClass());
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			{ 
			System.out.println("EQUALS:::::::::in false::::::::::::");
			     return false;
			}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal != other.sal)
			return false;
		{
			System.out.println("EQUALS:::::::::in true::::::::::::");
			return true;
		}
	}




	@Override
	public String toString() {
		return "Employee [age=" + age + ", sal=" + sal + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//       Employee other = (Employee) o;
//       return this.name.compareTo(other.name);
//    	  
//	}

	@Override
	public int compareTo(Employee o) {
		
        if(this.age > o.age)
        	return 1;
        else if(this.age < o.age)
        	return -1;
        else if(this.equals(o))
		return 0;
        else
        	return 0;
        
	}
	
}