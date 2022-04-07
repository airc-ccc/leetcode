import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int left = 47;
        int right= 85;
        List<Integer> result = selfDividingNumbers(left, right);

        System.out.println(result);
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        int si = 4;
        for (int i = left; i <= right; i++) {
            if (i == 1 || i < 10) {
                result.add(i);
            } else {
                boolean isSelfDiv = true;
                StringBuilder sb = new StringBuilder(String.valueOf(i));
                for(int j = 0; j<sb.length();j++) {
                    char sj = sb.charAt(j);
                    int sjI = Character.getNumericValue(sj);
                    if (sjI == 0) {
                        isSelfDiv = false;
                        continue;
                    }
                    if (i % sjI != 0) {
                        isSelfDiv = false;
                    }
                }
                if (isSelfDiv) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
