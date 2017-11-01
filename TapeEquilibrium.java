package codility;

import java.util.Scanner;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum[] = new int[n - 1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long sumLeft = 0;
		long sumRight = 0;
		long ans;
		if (arr.length == 2)
	        ans = Math.abs(arr[0]-arr[1]);
		for(int i = 1; i < arr.length; i++) {
			sumRight += arr[i];
		}
		sumLeft = arr[0];
		ans = Math.abs(sumLeft + sumRight);
		for(int p = 1; p < arr.length; p++) {
			if(Math.abs(sumLeft - sumRight) < ans) {
				ans = Math.abs(sumLeft - sumRight);
			}
			sumLeft +=arr[p];
			sumRight -= arr[p];
		}
		System.out.println(ans);
		sc.close();
	}

}
