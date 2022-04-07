class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(trailingZeroes(n));
    }


    public static int trailingZeroes(int n) 
    {
        int res = 0;
        int n = 5;
        while(n >= 5) {
            res += n / 5;
            n = n / 5;
        }
        return res;
    }
}