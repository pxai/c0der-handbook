
import java.util.Hashtable;
import java.util.Arrays;

class GnomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
    	    int sol[] = new int[P.length];

    	    Hashtable<String, Integer> hash = new Hashtable();
    	    hash.put("A",1);
    	    hash.put("C",2);
    	    hash.put("G",3);
    	    hash.put("T",4);

    	    for (int i=0;i<P.length;i++) {
    	    	char[] sub = S.substring(P[i], Q[i]+1).toCharArray();
    	    	Arrays.sort(sub);
    	    	System.out.println(sub);
    	    	sol[i] = hash.get(sub[0]+"");
    	    }

    	    return sol;
    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution("CAGCCTA", new int[] { 2,5,0}, new int[] { 4,5,6}));
	}
}
