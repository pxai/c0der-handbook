class Solution {
    public int solution(int N) {
        // 80%
        String binary = Integer.toBinaryString(N);
        int max = 0;
        int current = 0;
       for(int i = 0; i< binary.length(); i++) {
            if (binary.charAt(i) =='0') {
                current++;
            } else if (current > max) {
                max = current;
                current = 0;
            }
        }

        return max;
    }
}
