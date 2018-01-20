public class Solution {
    public int[]  solution(int A[], int K) { // 100%

    	if (A.length==0 || K==0 || K==A.length ) { return A; }

    	if (K > A.length) { K = (K % A.length);  }

    	int B[] = new int[A.length];

    	for (int i = K, j=0; i< A.length; i++, j++) {
    		B[i] = A[j];
    	}

    	for (int i = 0, j=A.length-K; i< K; i++, j++) {
    		B[i] = A[j];
    	}

       return B;
    }

    public static void main (String [] args) {

    	Solution s = new Solution();

    	int [] b = s.solution(new int[] {3, 8, 9, 7, 6}, 3);
    	for (int v: b)
    		System.out.print(v +",");

    	System.out.println("\n-");
    	b = s.solution(new int[] {1,2,3,4,5,6,7}, 3);
    	for (int v: b)
    		System.out.print(v +",");

    	System.out.println("\n-");
    	b = s.solution(new int[] {1,2,3,4,5,6,7}, 7);
    	for (int v: b)
    		System.out.print(v +",");

    	System.out.println("\n-");
    	b = s.solution(new int[] {1,2,3,4,5,6,7}, 0);
    	for (int v: b)
    		System.out.print(v +",");

    	System.out.println("\n-");
    	b = s.solution(new int[] {1,2,3,4,5,6,7}, 10);
    	for (int v: b)
    		System.out.print(v +",");

    	System.out.println("\n-");
    	b = s.solution(new int[] {1,2,3,4,5,6,7}, 1);
    	for (int v: b)
    		System.out.print(v +",");

    }
}
