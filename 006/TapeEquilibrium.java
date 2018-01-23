

public class TapeEquilibrium {
	public int solution(int[] A) { // 91%
		int min = Integer.MAX_VALUE;
		if (A.length == 2) { return Math.abs(A[0]-A[1]);}
		int result[] = new int[A.length];
		int result2[] = new int[A.length];

		result[0] = A[0];
		result2[A.length -1] = A[A.length-1];

		for (int i = 1; i< A.length; i++) {
			result[i] = A[i] + result[i-1];
		}

		for (int i = A.length-2; i>=0;i--) {
			result2[i] = result2[i+1] + A[i];
		}

//		for (int i=0;i<result.length;i++) { System.out.print(result[i]+",");}
//		System.out.println("\n----------------------");
//		for (int i=0;i<result2.length;i++) { System.out.print(result2[i]+",");}

		for (int i = 1; i< result.length-1; i++ ) {
			if (Math.abs(result[i]-result2[i+1])<= min) {
				min = Math.abs(result[i]-result2[i+1]);
			}
		}

		return min;

    }

    public static void main (String [] args) {

    	Solution s = new Solution();
    	System.out.println("\n:" + s.solution(new int[]{1,1}));
    	System.out.println("\n:" + s.solution(new int[]{2,3,1,5}));
    	System.out.println("\n:" + s.solution(new int[]{3,1,2,4,3}));

    }
}
