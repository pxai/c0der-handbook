import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) { // 77%
    	int B [] = new int[N];
    	int max = 0;
    	for (int i=0;i<A.length;i++) {
    		if (A[i] >= 1 && A[i] <= N) {
    			B[A[i]-1]++;
    			if (B[A[i]-1] > max) { max = B[A[i]-1];}
    		} else if (A[i] == N +1) {
    			for (int j =0;j < N;j++)	{
    				B[j] = max;
    			}
    		}
//    		for (int x=0;x<B.length;x++) {
//    			System.out.print(B[x]+ ", ");
//    		}
//    		System.out.println("..");
    	}

		return B;
    }

	public static void main(String[] args) {

		Solution s = new Solution();
//		System.out.println(s.solution(3new int[] { 1 }));
//		System.out.println(s.solution(new int[] { 0 }));
//		System.out.println(s.solution(new int[] { 4, 5, 6, 2 }));
//		System.out.println(s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));
		int[] r = s.solution(5, new int[] { 3,4,4,6,1,4,4 });
		for (int i=0;i<r.length;i++) {
			System.out.print(r[i]+ ", ");
		}
//		System.out.println(s.solution(new int[] { -1, -3}));
//		System.out.println(s.solution(new int[] {-3,-5,-7,-1,0,3,5}));
	}
}
