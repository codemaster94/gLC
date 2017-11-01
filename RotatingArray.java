package codility;

//import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] A = new int[5];
		for(int i = 0; i < 5; i++) {
			A[i] = sc.nextInt();
		}
		 int[] a = new int[A.length];
	        for (int i = 0; i < A.length; i++) {
	            a[(i + k) % A.length] = A[i];
	        }
	        for (int i = 0; i < A.length; i++) {
	            A[i] = a[i];
	        }   
	        
        for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
        
		sc.close();
	}

}
