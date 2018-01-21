public class Solution {
	public int solution(int X, int Y, int D) { // 100%

       return  ((Y-X)%D == 0)?(Y-X)/D:((Y-X)/D) + 1;
    }

    public static void main (String [] args) {

    	Solution s = new Solution();

    	System.out.println(s.solution(10, 85, 30));
       	System.out.println(s.solution(0, 120, 30));
       	System.out.println(s.solution(100, 130, 30));


    }
}
