/**
 * @author : pengtao
 * @created : 2022-02-09
**/
class Solution {

	public static void main (String[] args) {
		int[] nums = new int[]{10,2,10,9,1,6,8,9,2,8};
		int k = 5;
		int res = countKDifference(nums, k);	
		System.out.println(res);
	}


    public static int countKDifference(int[] nums, int k) {
		int rets = 0;	
		for(int i=0;i<nums.length;i++) {
			for(int j = i + 1; j < nums.length;j++) {
				int res = nums[i] - nums[j];
				if (-res == k || res == k) {
					rets++;	
				}
			}
		}
		return rets;
    }
}
