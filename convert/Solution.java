import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main (String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 3;
        convert(s, rows);
    }


    public static String convert(String s, int numRows) {
        String res = "";
        char[] carray = s.toCharArray();
        Map<Integer, StringBuffer> lines = new HashMap<Integer, StringBuffer>();
        int j = 0;
        for(int i = 0; i < carray.length; i++) {
            if (i >= numRows) {
                int x =  i - numRows;
                if (x == 0) {
                    j++;
                }
                if (x != 0 && x < numRows) {
                    j++;
                }
            }
            StringBuffer sb = new StringBuffer();
            if (lines.containsKey(j)) {
                StringBuffer sb2 = lines.get(j);
                sb2.append(carray[i]);
                lines.put(j, sb2);
            } else {
                sb.append(carray[i]);
                lines.put(j, sb);
            }
        }
        System.out.println(lines);

        return res;
    }
}