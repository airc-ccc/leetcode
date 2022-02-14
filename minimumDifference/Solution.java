/**
 * @author : pengtao
 * @created : 2022-02-11
**/
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {

	public static void main (String[] args) {
		int[] nums = new int[]{9, 1, 4, 7, 3, 5};		
		int k = 3;
		System.out.println(minimumDifference(nums, k));
	}


    public static int minimumDifference(int[] nums, int k) {
		int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < n; ++i) {
			int o = nums[i + k - 1];
			int w = nums[i];
			System.out.println(o);
			System.out.println(w);
			System.out.println("==========");
            ans = Math.min(ans, o - w);
        }
        return ans;
    }
}
