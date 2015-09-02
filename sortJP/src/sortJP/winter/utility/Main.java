package sortJP.winter.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(new Date().getTime());
		int a = Math.abs(rand.nextInt()) % 200;
		ArrayList<Integer> resultList = GetPrime.getPrime(a);
		// System.out.println(a);
		Iterator<Integer> it = resultList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
