/**
 * @author : pengtao
 * @created : 2021-03-22
**/
class main {
	public static void main (String[] args) {
		int[] num1 = {2, 4, 6};
		int[] num2 = {3, 6, 9};

		double middV = middleValue(num1, num2);
		System.out.println(middV);
	}


	/**
	 * Two int list middle value.
	 * @param int[] num1
	 * @param int[] num2
	 *
	 * @return double
	 */
	private static double middleValue(int[] num1, int[] num2) {
		int m = num1.length;
		int n = num2.length;
		int len = m + n;
		int middleKey = len / 2;

		int mK = 0;
		int nK = 0;
		if (middleKey % 2 == 0) {
			mk = middleKey;
			nk = middleKey + 1;
		}

		double middle = 0.00;
		for (int i = 0; i < len; i ++) {
			if (i == m) {

			}
		}

		return 0.00;
	}
}
