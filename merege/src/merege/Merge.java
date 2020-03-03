package merege;

import java.util.Arrays;

public class Merge {

	public static void sortedMerge(int arr1[], int arr2[], int res[]) {
// Concatenate two arrays 
		
		int i = 0, j = 0, k = 0;
		int n = arr1.length;
		int m = arr2.length;
		while (i < n) {
			res[k] = arr1[i];
			i++;
			k++;
		}

		while (j < m) {
			res[k] = arr2[j];
			j++;
			k++;
		}

// sorting the res array 
		Sort(res);
	}

	static void Sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
	
	public static void main(String[] args) {
		int arr1[] = { -1,1,3,5,7,9 };
		int arr2[] = { -2,2,3,4,5,6 };
		int n = arr1.length;
		int m = arr2.length;

		// Final merge list
		int res[] = new int[n + m];
		sortedMerge(arr1, arr2, res);

		System.out.print("Sorted merged list :");
		for (int i = 0; i < n + m; i++)
			System.out.print(" " + res[i]);
	}
}
class Employee implements Comparable<Employee>{
	int age;
	int sal;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sal;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}
	String name;
	@Override
	public int compareTo(Employee o) {

		if(this.age > o.age)
			return 1;
		
		
		return 0;
	}
	
}