package sortJP.winter.sort;

public class HeapSort {
	
	static void heapSort(int[] a){
		adjustHeap(a);
		
		return;
	}
	
	static private void adjustHeap(int[] a) {
		printArr(a);
		return;
	}
	static private void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}
}
