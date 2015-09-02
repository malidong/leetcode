package sortJP.winter.search;

public class KMP {

	public static int kmpMatch(String strA, String strP) {
		char[] a = strA.toCharArray();
		char[] p = strP.toCharArray();

		return kmpMatch(a, p);
	}

	public static int kmpMatch(char[] a, char[] p) {
		int result = -1;

		int[] next = buildNext(p);
		int offset = 0;
		int i = 0;
		int j = next[offset];

		while (i < a.length - p.length) {

			while (j < p.length) {
				if (a[i + j] == p[j++]) {
					if (j == p.length) {
						result = i;
						return result;
					}
				} else {
					offset = p.length + 1 - next[j];
					i = i + offset;
				}
			}
		}

		return result;
	}

	private static int[] buildNext(char[] p) {
		int[] result = new int[p.length + 2];

		int i = 1, t = 0;
		result[1] = 0;

		while (i < p.length + 1) {

			printArr(result);
			while (t > 0 && p[i - 1] != p[t - 1]) {
				t = result[t];
			}

			t++;
			i++;
			if (p[i - 1] == p[t - 1]) {
				result[i] = result[t];
			} else {
				result[i] = t;
			}

		}

		while (t > 0 && p[i - 1] != p[t - 1]) {
			t = result[t];
		}

		++t;
		++i;

		result[i] = t;
		printArr(result);

		return result;

	}

	public static int normalMatch(String strA, String strP) {
		char[] a = strA.toCharArray();
		char[] p = strP.toCharArray();

		return normalMatch(a, p);
	}

	public static int normalMatch(char[] a, char[] p) {
		int result = -1;
		for (int i = 0; i < a.length - p.length; i++) {
			int j = 0;
			int t = i;
			while (j < p.length) {
				if (a[t++] == p[j++]) {
					if (j == p.length) {
						result = i;
						// return result;
					}
					continue;
				} else {
					break;
				}
			}
		}
		return result;
	}

	static private void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}