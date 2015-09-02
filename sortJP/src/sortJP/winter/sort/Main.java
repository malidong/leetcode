package sortJP.winter.sort;

import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random(new Date().getTime());
		int[] a = new int[14];
		System.out.print("Array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt() % 100;
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
		// InsertSort.insertSort(a);
		// SelectionSort.selectionSort(a);
		//BubbleSort.bubbleSort(a);
		QuickSort.quickSort(a);
		System.out.print("\nSorted: ");
		printArr(a);
		System.out.println("");

		Heap hp = new Heap();
		hp.loadArray(a);

		hp.depthFirstTravel();
		hp.breadthFirstTravel();
		return;
	}

	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}
}
