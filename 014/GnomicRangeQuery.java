import java.util.Hashtable;
import java.util.Arrays;

class Solution {
	public int[] solution(String S, int[] P, int[] Q) { // 62% , obvious result
    	    int sol[] = new int[P.length];
    	    int gen[] = new int[S.length()];

    	    Hashtable<String, Integer> hash = new Hashtable();
    	    hash.put("A",1);
    	    hash.put("C",2);
    	    hash.put("G",3);
    	    hash.put("T",4);

    	    for (int i= 0; i< gen.length; i++)
    	    	gen[i] = hash.get(S.charAt(i)+"");

    	    for (int i=0;i<P.length;i++) {
    	    	//char[] sub = S.substring(P[i], Q[i]+1).toCharArray();
    	    	int min = 5;
    	    	for (int j=P[i]; j <= Q[i];j++) {
    	    		if (gen[j] == 1) { min = 1; break;}
    	    		else if (gen[j]<min) { min = gen[j];}
    	    	}
    	    	sol[i] = min;
    	    }

    	    return sol;
    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution("CAGCCTA", new int[] { 2,5,0}, new int[] { 4,5,6}));
	}
}
