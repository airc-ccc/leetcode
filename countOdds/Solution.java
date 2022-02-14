/**
 * @author : pengtao
 * @created : 2022-02-10
**/
class Solution {
	
	public static void main (String[] args) {
		
		System.out.println(countOdds(0, 8));
	}

	
    public static int countOdds(int low, int high) {
		if (low % 2 == 0 && high % 2 == 0) {
			return (high - low) / 2;	
		}
		return (high - low) / 2 + 1;	
    }
}
