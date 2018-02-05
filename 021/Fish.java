import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Fish {
  public int solution(int[] A, int[] B) {
      int solution = 0;
      int v = 0;

      Stack<Integer> fishes = new Stack<Integer>();
      Stack<Integer> killers = new Stack<Integer>();

      int pushThem = -1;

      for (int i = 0;i < A.length;i++) {
          if (B[i] != 0) {
              if (pushThem == -1) { pushThem = i; }
              killers.push(B[i]);
          }

          if (pushThem != -1) {
              fishes.push(A[i]);
          }
      }



      for (int i = pushThem;i<B.length;i++) {

      }

      return solution;
  }
}
