class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,4};
        int res = singleNonDuplicate(nums);
        System.out.println(res);
    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int res = 0;
        for(int j = 0;j + 2 - 1 < n;j++) {
            if (j == 0) {
                if (nums[j] - nums[j+1] != 0) {
                    return nums[j];
                }
            } else {
                if (nums[j] - nums[j+1] != 0 && nums[j] - nums[j - 1] != 0) {
                    return nums[j];
                }
                if (nums[j] - nums[j+1] != 0 && nums[j] - nums[j - 1] == 0) {
                    res =  nums[j+1];
                }
            }
        }
        return res;
    }
}
