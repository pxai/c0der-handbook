import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MaxProductOfTree {
    public int solution(int[] A) {
       Arrays.sort(A);
       int c1= A[A.length-3]*A[A.length-2]*A[A.length-1];
       int c2=A[0]*A[1]*A[A.length-1];
       return (c2>c1?c2:c1);
    }
}
