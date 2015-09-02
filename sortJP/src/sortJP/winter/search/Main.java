package sortJP.winter.search;

import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random(new Date().getTime());
		char[] a = new char[5000];
		char[] p = new char[14];

		System.out.print("String: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (Math.abs(rand.nextInt() % 4) + 65);
			//System.out.print(a[i]);
		}

		System.out.print("\nPattern: ");

		for (int i = 0; i < p.length; i++) {
			p[i] = (char) (Math.abs(rand.nextInt() % 4) + 65);
			System.out.print(p[i]);
		}
		System.out.println("");

		long startTime = System.currentTimeMillis();

		//int result = KMP.normalMatch(a, p);
		int result = KMP.kmpMatch(a, p);
		System.out.println("Result: " + result);
		for (int i = result; i < result + p.length && i > -1; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
		long endTime = System.currentTimeMillis();
		System.out.println("Time: " + (endTime - startTime) + "ms");

		return;
	}

	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}

}
