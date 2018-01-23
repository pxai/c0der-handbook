import java.util.Arrays;

public class PermCheck {
	public int solution(int[] A) { // 100%
		if (A.length == 1) { return (A[0] == 1)?1:0;}

		int b[] = new int[A.length];
		Arrays.sort(A);
		if (A[0] != (A[1]-1) || A[0] != 1) { return 0; }
		for (int i = 1; i< A.length-1; i++) {
			if (A[i] != (A[i+1]-1)) {
				return 0;
			}
		}

		return 1;

    }

    public static void main (String [] args) {

    	Solution s = new Solution();
    	System.out.println("\n:" + s.solution(new int[]{1}));
    	System.out.println("\n:" + s.solution(new int[]{0}));
    	System.out.println("\n:" + s.solution(new int[]{-1}));
    	System.out.println("\n:" + s.solution(new int[]{1,2}));
    	System.out.println("\n:" + s.solution(new int[]{2,3}));
    	System.out.println("\n:" + s.solution(new int[]{2,3,1,4}));
    	System.out.println("\n:" + s.solution(new int[]{3,1,2,4,3}));

    }
}
