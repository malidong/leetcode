package sortJP.winter.search;

import java.util.Date;
import java.util.Random;

public class HammingWeight {

	public static int getIntegerHammingWeight(int a) {
		int result = 0x00000000;

		int M1 = 0x55555555;
		int M2 = 0x33333333;
		int M4 = 0x0f0f0f0f;
		int M8 = 0x00ff00ff;
		int M16 = 0x0000ffff;

		result = (a & M1) + (a >> 1 & M1);
		result = (result & M2) + (result >> 2 & M2);
		result = (result & M4) + (result >> 4 & M4);
		result = (result & M8) + (result >> 8 & M8);
		result = (result & M16) + (result >> 16 & M16);

		return result;
	}

	public static void main(String[] args) {
		Random rand = new Random(new Date().getTime());
		int a = rand.nextInt();
		System.out.println(a + ": " + getIntegerHammingWeight(a));
	}

}
