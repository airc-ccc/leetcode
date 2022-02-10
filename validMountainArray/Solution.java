/**
 * @author : pengtao
 * @created : 2022-02-10
**/
class Solution {
	public static void main (String[] args) {
		// int[] arr = new int[]{0,1,2,4,2,1};	
		int[] arr = new int[]{1,1,1,1,1,1,1,2,1};	
		System.out.println(validMountainArray(arr));
	}
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
		boolean haveMount = false;
        for(int i=0;i<arr.length;i++) {
			int j = i + 1;
            int iVal = arr[i];
			if (j == arr.length) {
				int iPrevVal = arr[i-1];
				if (iVal >= iPrevVal) {
					return false;
				}
				return true;
			}
            int jVal = arr[j];
			if (i != 0) {				
				int iPrevVal = arr[i-1];
				if (haveMount) {
					if (iVal >= iPrevVal) {
						return false;
					}
				} else {
					if (iVal <= iPrevVal) {
						return false;
					}
					if (iPrevVal < iVal && jVal < iVal) {
						haveMount = true;
					}
				}
			} else {
				if (haveMount) {
					if (iVal < jVal) {
						return false;
					}
				} else {
					if (iVal > jVal) {
						return false;
					}
				}
			}
        }
        return true;
    }
}
