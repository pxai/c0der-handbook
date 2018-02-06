import java.util.Stack;

class StoneWall {
    public int solution(int[] H) { // 100%
      if (H.length == 1) { return 1; }
       Stack<Integer> block = new Stack<Integer>();
       int change = 0;


       for (int i = 0; i<H.length;i++) {
           while (!block.isEmpty() && H[i] < block.peek()) {
               block.pop();
           }
           if (block.isEmpty()) {
               change++;
               block.push(H[i]);
           } else if (H[i] > block.peek()) {
               change++;
               block.push(H[i]);
           }
       }
       //System.out.println(block);
       return change;
    }
}
