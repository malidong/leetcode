package sortJP.winter.search;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		int result = s.length() - 1;

		char[] cs = s.toCharArray();
		while (result > 0 && cs[result] != ' ') {
			result--;
		}

		result = s.length() - 1 - result;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
