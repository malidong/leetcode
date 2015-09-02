package sortJP.winter.sort;

public class BubbleSort {

	public static void bubbleSort(int[] a) {

		int tmp = 0;
		boolean change_flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				} 
				//System.out.print(a[j] + ", ");
			}
			//System.out.println("");
			if (!change_flag)
				break;
		}
		return;
	}
}
