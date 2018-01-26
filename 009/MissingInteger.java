import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {//66%
    	int B [] = new int[A.length];

		if (A.length == 1) {
			return (A[0]<=0)?1:(A[0]>1?1:2);
		}

		for (int i=0;i< A.length;i++)
			if (A[i] > 0)
				B[i] = A[i];

		Arrays.sort(B);
		//for (int i: B)	{ System.out.print(i +",");} // [-1000000, 1000000] check! 
		if (B[0] > 1) { return 1; }
		for (int i = 1; i < B.length; i++)
			if (B[i-1] != B[i] && B[i - 1] != B[i] - 1)
				return B[i]-1;

		return (B[B.length-1] == 0)?1:(B[B.length-1]+1);
    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println("\n:" + s.solution(new int[] { 1 }));
		System.out.println("\n:" + s.solution(new int[] { 0 }));
		System.out.println("\n:" + s.solution(new int[] { 4, 5, 6, 2 }));
		System.out.println("\n:" + s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));
		System.out.println("\n:" + s.solution(new int[] { 3, 1, 2, 4, 3 }));
		System.out.println("\n:" + s.solution(new int[] { -1, -3}));
		System.out.println("\n:" + s.solution(new int[] {-3,-5,-7,-1,0,3,5}));
	}
}
