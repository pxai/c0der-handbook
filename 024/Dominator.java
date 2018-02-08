import java.util.*;


class Dominator {
    public int solution(int[] A) { // 100%
       Hashtable<Integer,Integer> v = new Hashtable<Integer, Integer>();


       for (int i =0;i<A.length;i++){
           if (v.containsKey(A[i])) {
               int c = v.get(A[i]) + 1;
               v.put(A[i], c);
           } else {
               v.put(A[i],1);
           }
       }

      // System.out.println(v);
        Set<Integer> keys = v.keySet();
        Iterator<Integer> itr = keys.iterator();
        int max = -1;
        while (itr.hasNext()) {
            int i = itr.next();
            if (v.get(i) > A.length/2) {
                max = i;
                break;
            }
        }

        if (max != -1) {
            for (int i=0;i<A.length;i++)
                if (A[i] == max)
                    return i;
        }
       return -1;
    }
}
