import java.util.Arrays;
import java.util.function.Function;

class PassngCars {
    public int solution(int [] A) {
    	if (A.length < 2) { return 0; }
      	int [] W = new int[A.length];
        int w = 0;
        int e = 0;
        int total = 0;
        int last = 0;

        for (int i=0;i<A.length;i++) {
        	if (A[i] == 1 && e == 0) { continue; }
        	if (A[i] == 1) {
        		W[i] = ++w;
        	} else {
        		e++;
        	}
        }

        for (int i=0, j = A.length-1;i<A.length;i++,j--) {
        	if (A[i] == 0) {
        		total += (W[j]!=0)?W[j]:last;
        	}
        	if (W[j] != 0) { last = W[j];}
        }


    	return total>1000000000?-1:total;
    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(new int[] {0,1,0,1,1})); // 1
		System.out.println(s.solution(new int[] {1,1,1,1,1})); // 1
		System.out.println(s.solution(new int[] {0,0,0,0,0})); // 1
		System.out.println(s.solution(new int[] {1,1})); // 1
		System.out.println(s.solution(new int[] {0,0})); // 1
		System.out.println(s.solution(new int[] {1,0})); // 1
		System.out.println(s.solution(new int[] {0,1})); // 1
//		System.out.println(s.solution(new int[] { 4, 5, 6, 2 }));
//		System.out.println(s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));

//		System.out.println(s.solution(new int[] { -1, -3}));
//		System.out.println(s.solution(new int[] {-3,-5,-7,-1,0,3,5}));
	}
}
