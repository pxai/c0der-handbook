import java.util.Arrays;

public class FrogRiverOne {
	 public int solution(int X, int[] A) { // 81%
		 int compara[] = new int[X+1];
		if (A.length == 1) { return (A[0] == X)?0:-1;}
		for (int i=0;i< A.length;i++)
			if (A[i]<=X && compara[A[i]] == 0)
				compara[A[i]] = i;


        Arrays.sort(compara);

		for (int i=1;i<compara.length;i++)
			if (compara[i] == 0)
				return -1;

		return compara[X];
    }

    public static void main (String [] args) {

    	Solution s = new Solution();
    	System.out.println("\n:" + s.solution(1, new int[]{1}));
    	System.out.println("\n:" + s.solution(2, new int[]{0}));
    	System.out.println("\n:" + s.solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
    	System.out.println("\n:" + s.solution(4, new int[]{3,1,2,4,3}));

    }
}
