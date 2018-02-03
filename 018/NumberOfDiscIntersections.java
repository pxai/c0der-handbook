
import java.util.Arrays;

class NumberOfDiscIntersections {
	public int solution(int[] A) {

		long B[] = new long[A.length];
		long C[] = new long[A.length];
		long count = 0;

		for (int i = 0; i < A.length; i++) {
			B[i] = (long) A[i] + i;
			C[i] = -((long) A[i] - i);
		}

		Arrays.sort(B);
		Arrays.sort(C);

		for (int i = A.length - 1; i >= 0; i--) {
			int pos = Arrays.binarySearch(C, B[i]);
			if (pos >= 0) {
				while (pos < A.length && C[pos] == B[i])
					pos++;
				count += pos;
			} else {
				count = count  - pos  - 1;
			}
		}

		count = count - (long) A.length * ((long) A.length + 1) / 2;

		if (count > 1e7) { return -1;}

		return (int) count;

	}

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 2, 5, 0 }));
	}
}
