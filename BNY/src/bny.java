import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bny {

	public static void main(String[] args) {
		int num = 0;
		List<String> list = Arrays.asList("6 2 2");
		String[] str = list.get(0).split(" ");
		System.out.println(Arrays.toString(str));
		Integer[] ints = new Integer[3];
		for(int i = 0; i < str.length ;i++) {
			ints[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(ints));
		System.out.println(ints[0]/ints[1]);
		num = ints[0]/ints[1];
		if(ints[0]/ints[1] == ints[2]) {
			num = num+1;
		}
		else if(ints[0]/ints[1] < ints[2]) {
			num = num + 0;
		}
		else if(ints[0]/ints[1] > ints[2]) {
			System.out.println("fshafhsd");
			int div = ints[0]/ints[1]; 
			System.out.println("div = "+div);
			System.out.println("ints[2] = "+ints[2]);
			int res = 0;
			//while(div < ints[2]) {
				if(div - ints[2] < ints[2]) {
					System.out.println("fshafhsd");

					num = num + 1;
				}
			//}
		}
		System.out.println(num);
//3
		//10 2 5
		//12 4 4
		//6 2 2
		// ANS 6 3 5
		
		//
		
		//	list1.add(40);
//	list1.add(8);
//	list1.add(6);
//	list1.add(22);
//	list1.add(9);
//	list1.add(7);
//	list1.add(50);
//	
//	List<Integer> list = removeSmallerToRight(list1);
//	
//	System.out.println(list);
		
		
	}
		
	
	
	private static List<Integer> removeSmallerToRight(List<Integer> list) {
	
	System.out.println(list);
	for (int i = 0; i < list.size()-1; i++)
        for (int j = 1; j < list.size()-i-1; j++)
            if (list.get(j) < list.get(j-1) && list.get(j) > list.get(j+1) )
            {
               list.remove(j+1); 
               System.out.println(list);
            }
	
	for (int i = 0; i < list.size()-1; i++)
        for (int j = 0; j < list.size()-i-1; j++)
            if (list.get(j) > list.get(j+1))
            {
               list.remove(j+1);
               System.out.println(list);
            }        
	
	return list;
}
	
	
	
}






























public static boolean isPalin(char str[], int st, int end) { 
    while (st < end) 
    { 
        if (str[st] != str[end]) 
            return false; 
        st++; 
        end--; 
    } 
    return true; 
   } 

    public static int shortestPalindrome(String s) {
    char[] str = s.toCharArray();    
    int n = str.length;



    for (int i=n-1; i>=0; i--) 
    {          
        if (isPalin(str, 0, i)) 
            return (n-i-1); 
           
            
    } 
      return -1;
    }
