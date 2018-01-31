
import java.util.Arrays;

class Solution {
	public int[] solution(int [] A) { // 100%
    if (A.length < 3) { return 0; }

 Arrays.sort(A);

 for (int i=0; i< A.length-2;i++)
     if (A[i] >= 0 && A[i+1] + A[i] > A[i+2])
         return 1;

 return 0;
}
}
