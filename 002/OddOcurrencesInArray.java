import java.util.Hashtable;
import java.util.Set;

public class Solution { // 100%
    public int solution(int[] A) {
        int found = 0;
        Hashtable<String, Integer> ocur = new Hashtable<String, Integer>();

        for (int i = 0; i< A.length; i++) {
        	String current = String.valueOf(A[i]);
            if (ocur.containsKey(current))
            	ocur.put(current, ocur.get(current) + 1);
            else
            	ocur.put(String.valueOf(A[i]), new Integer(1));
        }

        Set<String> keys = ocur.keySet();

        for(String key: keys)
        	if (ocur.get(key) % 2 != 0)
        		return Integer.parseInt(key);


        return found;
    }

    public static void main (String [] args) {

    	Solution s = new Solution();

    	System.out.println(s.solution(new int[] {7,9,3,7,3,9,7}));
    }
}
