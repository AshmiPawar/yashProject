package LinkedList;

import java.util.Arrays;

// Java Code for Merging two unsorted 
	// arrays in sorted order 
	

	class Merge { 

		// Function to merge array in sorted order 
		public static void sortedMerge(int a[], int b[], 
									int res[], int n, 
									int m) 
		{ 
			// Concatenate two arrays 
			int i = 0, j = 0, k = 0; 
			while (i < n) { 
				res[k] = a[i]; 
				i++; 
				k++; 
			} 
			
			while (j < m) { 
				res[k] = b[j]; 
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
		
		
		
		
		
		
		/* Driver program to test above function */
		public static void main(String[] args) 
		{ 
			int a[] = { 10, 5, 15 }; 
			int b[] = { 20, 3, 2, 12 }; 
			int n = a.length; 
			int m = b.length; 
		
			// Final merge list 
			int res[]=new int[n + m]; 
			sortedMerge(a, b, res, n, m); 
		
			System.out.print("Sorted merged list :"); 
			for (int i = 0; i < n + m; i++) 
				System.out.print(" " + res[i]); 
		} 
	} 

	// This code is contributed by Arnav Kr. Mandal. 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

