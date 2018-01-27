class CountDiv { // 100%
    public int solution(int A, int B, int K) {
        return (B/K) - (A/K) + (A%K==0?1:0);
    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(6,11,2));
		System.out.println(s.solution(11,345,17));
//		System.out.println(s.solution(new int[] { 4, 5, 6, 2 }));
//		System.out.println(s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));

//		System.out.println(s.solution(new int[] { -1, -3}));
//		System.out.println(s.solution(new int[] {-3,-5,-7,-1,0,3,5}));
	}
}
