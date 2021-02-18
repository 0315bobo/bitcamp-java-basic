package Hw;

public class gg {

	public static void main(String[] args) {
		int[] A = {5, 2, 4, 3, 1};
		
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 4 - i; j++) {
				if (A[j] > A[j+1]) {
					int temp;
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}//if end
			}//j for end
		}//i for end
		
		for( int i = 0; i < A.length ; i++) {
			
		    System.out.print(A[i]);
		}
	}
	

}
