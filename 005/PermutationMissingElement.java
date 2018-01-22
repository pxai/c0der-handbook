public class PermutationMissingElement {
	public int solution(int[] A) { // 100%

		if (A.length == 0) { return 1;}
		if (A.length == 1) { return A[0] == 1?2:1;}


		int result = 0;

		int [] possibles = new int[A.length+2];

		for (int i=0;i<A.length;i++) {
			possibles[A[i]] = 1;
		}

		for (int i=1;i<A.length+2;i++) {
			if (possibles[i] == 0) {
				result = i;
				break;
			}
		}

		return result;

    }

    public static void main (String [] args) {

    	Solution s = new Solution();
    	System.out.println(s.solution(new int[]{}));
    	System.out.println(s.solution(new int[]{1}));
    	System.out.println(s.solution(new int[]{2}));
    	System.out.println(s.solution(new int[]{2,3,1,5}));


    }
}
