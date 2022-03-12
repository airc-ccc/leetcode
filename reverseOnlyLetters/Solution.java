import java.util.Map;
import java.util.SortedSet;
import java.util.HashMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        String s = ",Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        Map<Integer, Character> anotherWord = new HashMap<Integer, Character>();
        //提取出所有非英文字符
        // 65 - 90 A-Z
        // 97 - 122 a-z
        int i = 0;
        int wi = 0;
        StringBuilder sb = new StringBuilder(s);
        for(char w : s.toCharArray()) {
            i++;
            wi++;
            int wInt = Integer.valueOf(w);
            if (wInt >= 65 && wInt <= 90) {
                continue;
            }
            if (wInt >= 97 && wInt <= 122) {
                continue;
            }
            anotherWord.put(i-1, w);
            sb.deleteCharAt(wi-1);
            // 当前字符被删除, 下标减一
            wi--;
        }
        System.out.println("Another Word: " + anotherWord);
        // 反转现在的剩余的字符串
        sb.reverse();
        // 把其他字符按照位置插入
        SortedSet<Integer> keys = new TreeSet<>(anotherWord.keySet());
        for (Integer si : keys) {
            char wis = anotherWord.get(si);
            sb.insert(si, String.valueOf(wis));
        }
        String resultString = sb.toString();
        return resultString;
    }
}