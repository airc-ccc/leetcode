/**
 * @author : pengtao
 * @created : 2022-02-10
**/

import java.util.List;
import java.util.ArrayList;

class Solution {

	public static void main (String[] args) {
		int n = 6;
		List<String> res = simplifiedFractions(n);
		System.out.println(res.toString());
	}

	public static int gcd(int a, int b)
	{
		if (a % b == 0) {
			return b;
		}
		return gcd(b, (a % b));
	}

    public static List<String> simplifiedFractions(int n) {
		List<String> res = new ArrayList<String>();
		if (n == 1) {
			return res;
		}
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				int gcd = gcd(i, j);
				if (gcd == 1) { 
					res.add(i+"/"+j);
				}
			}
		}
		return res;
    }
}
