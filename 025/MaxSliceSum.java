/ System.out.println("this is a debug message");

class Solution {
  public int solution(int[] A) { // 84%
    int [] B = new int[A.length];
    int [] C = new int[A.length];

    B[0] = A[0];


    for(int i=1;i<A.length;i++) {
      B[i] = B[i-1] + A[i];
    }

    C[A.length-1] = A[A.length-1];
    for(int i=A.length-2;i>=0;i--) {
        C[i] = C[i + 1] + A[i] ;
    }

//		  System.out.print("\nB: ");
//		  for (int i = 0; i < B.length; i++) {
//				System.out.print(B[i] + ", ");
//			}
//		  System.out.print("\nC: ");
//		  for (int i = 0; i < C.length; i++) {
//				System.out.print(C[i] + ", ");
//			}

    //Arrays.asList(B).stream().map(Object::toString).collect(Collectors.joining(", "));

    int max = B[0];
    for(int i=1;i<B.length;i++) {
        if (A[i]> B[i]) {
           B[i] = A[i];
        }
          if (B[i] > max) {
        max = B[i];}

    }

    int max2 = C[0];
    for(int i=1;i<C.length;i++) {
        if (A[i]> C[i]) {
           C[i] = A[i];
        }
          if (C[i] > max2) {
        max2 = C[i];}

    }

    return max>max2?max:max2;
  }

	public static void main(String[] args) {

		Solution s = new Solution();
		System.out.println(s.solution(new int[] {4,3,-5,2}));
		System.out.println(s.solution( new int[]{0}));
		System.out.println(s.solution(new int[] {4,3,-2,1,5}));
	}
}
