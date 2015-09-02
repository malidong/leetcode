package sortJP.winter.sort;

public class InsertSort {

	static void shellInsertSort(int[] a) {

		int dk = a.length / 2;
		while (dk > 0) {

			for (int i = dk; i < a.length; i++) {
				if (a[i - dk] > a[i]) {
					int j = i - dk;
					int x = a[i];
					a[i] = a[i - dk];
					while (x < a[j]) {
						a[j + dk] = a[j];
						j -= dk;
						if (j < 0)
							break;
					}
					a[j + dk] = x;
				}
			}

			dk = dk / 2;
		}
	}
	
	static void insertSort(int[] a) {

		int dk = 1;
		while (dk > 0) {

			for (int i = dk; i < a.length; i++) {
				if (a[i - dk] > a[i]) {
					int j = i - dk;
					int x = a[i];
					a[i] = a[i - dk];
					while (x < a[j]) {
						a[j + dk] = a[j];
						j -= dk;
						if (j < 0)
							break;
					}
					a[j + dk] = x;
				}
			}

			dk = dk / 2;
		}
	}
	
}
