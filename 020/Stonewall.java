import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        if (H.length == 1) { return 1; }
        Stack<Integer> block = new Stack<Integer>();
        int change = 0;
        int first = H[0];
        int prev = H[0];
        block.push(H[0]);

        for (int i = 1; i<H.length;i++) {
            if (H[i] < first) {
                change++;
                block = new Stack<Integer>();
                block.push(H[i]);
                prev = first = H[i];
            }else if (H[i] < prev) {
                change++;
                prev = H[i];
                block.pop();
                block.push(H[i]);
            } else {
                block.push(H[i]);
                change++;
            }
        }
        //System.out.println(block);
        return change - (block.size()-1);
    }
}
