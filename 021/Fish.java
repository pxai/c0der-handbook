import java.util.Stack;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Fish {
  public int solution(int[] A, int[] B) {
      int solution = 0;
      int v = 0;

      Stack<Integer> fishes = new Stack<Integer>();
      Stack<Integer> killers = new Stack<Integer>();
      int survivors = 0;
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
//
//      System.out.println(fishes);
//      System.out.println(killers);

      for (int i = pushThem;i<A.length;i++) {
    	  if (killers.isEmpty()) { break; }
    	  int top = fishes.peek();
    	  int killer = killers.peek();
    	  if (top > killer) {
    		  survivors++;
    		  killers.pop();
    		  fishes.pop();
    	  } else if (killer > top) {
    		  fishes.pop();
    	  }
      }

      return pushThem + survivors +  (killers.isEmpty()?0:killers.size());
  }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(new int[] {4,3,2,1,5}, new int[]{0,1,0,0,0}));
	}
}
