import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        List<Integer> res = new ArrayList<Integer>();
	        res.add(0);
	        res.add(0);
	        System.out.println(res);
	        
	        for(int i = 0 ; i < a.size(); i ++){
	            if(a.get(i) > b.get(i)) {
	               res.set(0,res.get(0)+1);
	               System.out.println("in first if" + res);
	               }
	            else if(a.get(i) < b.get(i))
	            { res.set(1,res.get(1)+1); 
	              System.out.println("in second if" + res);
	            
	            }
	            else if(a.get(i) == b.get(i)){
	            	
	                res.set(0,res.get(0)+0);
	                res.set(1,res.get(1)+0);
	                System.out.println("in third if"+res);
	            }     
	        }
	System.out.println(res);
	        return res;
	    }

	 public static void main(String[] args) {
		 long ar[] = { 1,2};
		 List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		 
		 
		 List<Integer> a = new ArrayList<Integer>();
		 List<Integer> b = new ArrayList<Integer>();
		 a.add(5);
		 a.add(6);
		 a.add(7);
		 
		 b.add(3);
		 b.add(6);
		 b.add(10);
		 
		 System.out.println("in mmain" +compareTriplets(a,b));
	}
}
