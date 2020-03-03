import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArraysCheck {

	public static void main(String[] args) {

//		List<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(10);
//		arr.add(2);
//		arr.add(-2);
//		arr.add(-20);
//		arr.add(6);
//		arr.add(7);
	    int[] arr = {10,2,-2,-20,6,7};	
	    subArraySum(arr,7, -10);
		
	}

	 public static void subArraySum(int[] arr, int n, int sum) { 
	        int cur_sum = 0; 
	        int start = 0; 
	        int end = -1; 
	        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
	        for (int i = 0; i < n; i++) { 
	            cur_sum = cur_sum + arr[i]; 
	            if (cur_sum - sum == 0) { 
	            	System.out.println("inif 1");
	                start = 0; 
	                end = i; 
	                break; 
	            } 
	            if (hashMap.containsKey(cur_sum - sum)) { 
	            	System.out.println("in if2");
	            	System.out.println("hashMap.get(cur_sum - sum) = "+hashMap.get(cur_sum - sum));
	                start = hashMap.get(cur_sum - sum) + 1; 
	                end = i; 
	                break; 
	            } 
	            hashMap.put(cur_sum, i); 
	     } 
	        if (end == -1) { 
	            System.out.println("No subarray with given sum exists"); 
	        } else { 
	            System.out.println("Sum found between indexes " 
	                            + start + " to " + end); 
	        } 
	  
	    } 
	
//	private static void sum(List<Integer> arr) {
//       
//		int sum = 0;
//		for(int i = 0; i < arr.size() ; i++) {
//
//			for(int j = i; j < arr.size() ; j++) {
//				//System.out.println("inn j");
//				sum += arr.get(j);
//				
//				if(sum == -10) {
//                 System.out.println(i+ " "+ j);
//                 for(int k = i ; k <= j ; k++)
//                	 System.out.print(arr.get(k)+" ");
//				}
//			
//			
//			
//    	   }
//       }
	
}
