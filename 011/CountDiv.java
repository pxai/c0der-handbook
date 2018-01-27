class CountDiv { // 50% try without loop...
    public int solution(int A, int B, int K) {
        int count = 0;
        for (int i=A;i<=B;i++) {
            if (i % K == 0)
                count++;
        }

        return count;

    }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(6,11,2));
		System.out.println(s.solution(0,10,4));
//		System.out.println(s.solution(new int[] { 4, 5, 6, 2 }));
//		System.out.println(s.solution(new int[] { 1, 3, 1, 3, 2, 1, 5 }));

//		System.out.println(s.solution(new int[] { -1, -3}));
//		System.out.println(s.solution(new int[] {-3,-5,-7,-1,0,3,5}));
	}
}
