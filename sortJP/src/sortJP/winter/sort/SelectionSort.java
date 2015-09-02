package sortJP.winter.sort;

public class SelectionSort {
	static void selectionSort(int[] a) {

		int tmp_max, tmp_min;
		for (int i = 0; i < a.length / 2; i++) {
			int offset_min = i;
			int offset_max = a.length - i - 1;
			
			for (int j = i; j < a.length - i - 1; j++) {
				if (a[offset_min] > a[j]) {
					offset_min = j;
				} else if (a[offset_max] < a[j]) {
					offset_max = j;
				}
			}
			
			tmp_max = a[offset_max];
			tmp_min = a[offset_min];

			a[offset_max] = a[a.length - i - 1];
			a[offset_min] = a[i];

			a[a.length - i - 1] = tmp_max;
			a[i] = tmp_min;
		}
	}
}
