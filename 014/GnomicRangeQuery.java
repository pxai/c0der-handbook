
import java.util.Hashtable;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
	public int[] solution(String S, int[] P, int[] Q) { // 100%
		int sol[] = new int[P.length];
		int gen[] = new int[S.length()];
		int A[] = new int[S.length()];
		int C[] = new int[S.length()];
		int G[] = new int[S.length()];
		int T[] = new int[S.length()];
		int a=0, c=0,g=0,t = 0;

		Hashtable<String, Integer> hash = new Hashtable();
		hash.put("A", 1);
		hash.put("C", 2);
		hash.put("G", 3);
		hash.put("T", 4);

		for (int i = gen.length - 1; i >= 0; i--) {
			gen[i] = hash.get(S.charAt(i) + "");

			switch (gen[i]) {
			case 1:
				A[i] = a = 1;
				C[i] = (c!=0)?++c:0;
				G[i] = (g!=0)?++g:0;
				T[i] = (t!=0)?++t:0;
				break;
			case 2:
				C[i] = c = 1;
				A[i] = (a!=0)?++a:0;
				G[i] = (g!=0)?++g:0;
				T[i] = (t!=0)?++t:0;
				break;
			case 3:
				G[i] = g = 1;
				A[i] = (a!=0)?++a:0;
				C[i] = (c!=0)?++c:0;
				T[i] = (t!=0)?++t:0;
				break;
			case 4:
				T[i] = t = 1;
				A[i] = (a!=0)?++a:0;
				C[i] = (c!=0)?++c:0;
				G[i] = (g!=0)?++g:0;
				break;
			default:
				break;
			}
		}

		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(C));
		System.out.println(Arrays.toString(G));
		System.out.println(Arrays.toString(T));

		for (int i = 0; i < P.length; i++) {
			// char[] sub = S.substring(P[i], Q[i]+1).toCharArray();
			int min = 5;

			if (Q[i] - P[i] >= (T[P[i]] - 1) && (T[P[i]] - 1)>=0) { min = 4; }
			if (Q[i] - P[i] >= (G[P[i]] - 1)&& (G[P[i]] - 1)>=0) { min = 3; }
			if (Q[i] - P[i] >= (C[P[i]] - 1)&& (C[P[i]] - 1)>=0) { min = 2; }
			if (Q[i] - P[i] >= (A[P[i]] - 1)&& (A[P[i]] - 1)>=0) { min = 1; }

			sol[i] = min;
		}

		return sol;
	}

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution("CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5, 6 })));
	}
}
