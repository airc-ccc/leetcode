/**
 * @author : pengtao
 * @created : 2022-02-10
**/
class Solution {
	public static void main (String[] args) {
		int[] arr = new int[]{0, 3, 2, 1};	
		System.out.println(validMountainArray(arr));
	}
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for(int i=0;i<arr.length;i++) {
            int iVal = arr[i];
            int jVal = arr[i+1];

			if (i != 0) {
				int iPrevVal = arr[i-1]; 
				if (iVal > jVal && iVal < iPrevVal) {
					System.out.println("First");
					System.out.println(iVal);
					System.out.println(jVal);
					return false;
				}
			} else {
				if (iVal > jVal) {
					System.out.println("Sirst");
					System.out.println(iVal);
					System.out.println(jVal);
					return false;
				}
			}
        }
        return true;
    }
}
