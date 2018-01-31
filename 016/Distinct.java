
import java.util.Arrays;


class Distinct {
    public int solution(int[] A) { // 100%
		if (A.length <2) { return A.length;}
		int result = 0;

		Arrays.sort(A);
		int previous = A[0];
		result++;

		for (int i=1;i< A.length;i++)
			if (A[i] != previous) {
				previous = A[i];
				result++;
			}



		return result;
    }
}
