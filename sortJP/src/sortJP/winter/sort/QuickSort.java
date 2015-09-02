package sortJP.winter.sort;

public class QuickSort {
	public static void quickSort(int[] a) {
		subQuickSort(a, 0, a.length - 1);
	}

	private static void subQuickSort(int[] a, int low, int high) {

		if (low < high) {

			int privotKey = a[low];
			int i = low;
			int j = high;
			
			while (i < j) {
				while (i < j && a[j] >= privotKey) {
					j--;
				}
				{
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
				
				while (i < j && a[i] <= privotKey) {
					i++;
				}
				{
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}

			subQuickSort(a, low, i - 1);
			subQuickSort(a, j + 1, high);

		}
	}

	static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("");
	}
}
