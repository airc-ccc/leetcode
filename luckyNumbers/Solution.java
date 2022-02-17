import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

class Solution {
    public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }




	public static List<Integer> myLuckyNumbers(int[][] matrix) {
	
		List<Integer> ret = new ArrayList<Integer>();
		int m = matrix.length, n = matrix[0].length;
		// 预处理,找出每行最小的数
		
		// 预处理,找出每列最大的数

		return ret;
	}













































	public static List<Integer> luckyNumbers(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		List<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < n ; j++) {
				boolean isMin = true, isMax = true;
				for (int k = 0; k < n; k++) {
					if (matrix[i][k] < matrix[i][j]) {
						isMin = false;
						break;
					}
				}
				if (!isMin) {
					continue;
				}
				for(int k = 0; k < m; k++) {
					if (matrix[k][j] > matrix[i][j]) {
						isMax = false;
						break;
					}
				}
				if (isMax) {
					ret.add(matrix[i][j]);
				}
			}

		}
		return ret;
	}

}
