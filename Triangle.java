        if (A.length < 3) { return 0; }
        int B[] = new int[(A.length * 2)  - 2];
        
        for (int i=1;i< B.length; i++) {
            for (int j=i;j<A.length; j++) {
                B[i-1] = A[i-1] + A[j];
            }
        }
        
        
        for (int i=0;i<B.length - 2; i++) {
            if (B[i] + B[i+1] > B[i+2] &&
                B[i+1] + B[i+2] > B[i] &&
                B[i+2] + B[i] > B[i+1]) {
                return 1;
            }   
        }
        
        return 0;
