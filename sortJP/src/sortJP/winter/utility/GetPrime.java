package sortJP.winter.utility;

import java.util.ArrayList;

public class GetPrime {

	public static ArrayList<Integer> getPrime(int n) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		boolean[] result = new boolean[n + 1];

		double upper = Math.sqrt(n);
		for (int i = 2; i < upper; i++) {
			if (result[i])
				continue;

			result[i] = isNotPrime(i);
			int tmp = i + i;
			while (tmp <= n) {
				result[tmp] = !result[i];
				tmp += i;
			}
		}

		for (int i = 2; i < n + 1; i++) {
			if (!result[i])
				resultList.add(i);
		}

		//printArr(result);

		return resultList;
	}

	private static boolean isNotPrime(int n) {
		boolean result = false;
		for (int i = 2; i < n / 2 + 1; i++) {
			if (n % i == 0)
				result = true;
		}
		return result;
	}
	
	@SuppressWarnings(value = { "unused" })
	private static void printArr(boolean[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}
}
