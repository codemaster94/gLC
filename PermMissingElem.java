package codility;

import java.util.Scanner;

public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		long N = A.length + 1;
		long total = N*(N+1)/2;
		for(int i: A) {
			total -= i;
		}
		System.out.println(total);
		sc.close();

	}

}
