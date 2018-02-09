/ System.out.println("this is a debug message");

class Solution {
  public int solution(int[] A) {
	  int [] B = new int[A.length];

	  B[0] = A[0];
	  for(int i=1;i<A.length;i++)
		  B[i] = B[i-1] + A[i];

	 //Arrays.asList(B).stream().map(Object::toString).collect(Collectors.joining(", "));
	  int max = 0;
	  for(int i=0;i<B.length;i++) {
			if (B[i] > max)
				max = B[i];
	  }

	  return max;
  }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(new int[] {4,3,-5,2}));
		System.out.println(s.solution( new int[]{0}));
		System.out.println(s.solution(new int[] {4,3,-2,1,5}));
	}
}
