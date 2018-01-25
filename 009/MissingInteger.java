import java.util.Arrays;

public class Solution {
	public int solution(int[] A) { // 81%

		if (A.length == 1) {
			return 0;
		}

		Arrays.sort(A);

		for (int i = 1; i < A.length; i++) {
			if (A[i-1] <0) continue;
			if (A[i-1] != A[i] && A[i - 1] != A[i] - 1)
				return A[i]-1;
		}
		return (A[A.length-1] > 0)?A[A.length-1] +1:1;
	}

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println("\n:" + s.solution(new int[] { 1 }));
		System.out.println("\n:" + s.solution(new int[] { 0 }));
		System.out.println("\n:" + s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));
		System.out.println("\n:" + s.solution(new int[] { 3, 1, 2, 4, 3 }));
		System.out.println("\n:" + s.solution(new int[] { -1, -3}));
	}
}
