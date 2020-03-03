package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int N = 10, K = 10, count = -1;
		int rounds = 0;
		int org = N;
		if (K == 0) {
			System.out.println(N - 1);
		}

		List<Integer> list = new ArrayList<Integer>();
		while (N > 0 && K > 0) {
			if (N / 2 > 1)
				list.add(N / 2);
			N = N / 2;
			K--;
		}
		list.add(1);

		System.out.println(list);

		for (int i = list.size(); i > 1; i--) {
			// System.out.println("for");
			int temp = list.get(i - 2);
			for (int j = list.get(i - 1) * 2; j <= temp; j++) {
				// System.out.println("for2");
				count++;
				System.out.println("inner =" + count);

			}
			count++;
			System.out.println("outer =" + count);

		}

		System.out.println(count);

	}

}
