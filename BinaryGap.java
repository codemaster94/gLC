package codility;

import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] test = new int[3];
		for(int i = 0; i < 2; i++) {
			test[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(solution1(test[i]));
		}
		//
		sc.close();
	}
	static int solution1(int n) {
		return solution(n, 0, 0);
	}
	static int solution(int N, int max, int current) {
		if (N<5)
			return 0;
		else if (N==5)
			return 1;
		else if (N<9)
			return 0;
			
		String bin = Integer.toBinaryString(N); //Binary String Representation of Integer
		int mc = 0; //Max Count
		int cc = 0; //Count
			
		for (int i=1; i<bin.length(); i++) //Loop Through Binary String From 2nd Element
		{
			if (bin.charAt(i)=='0')
			   cc++; //Increment Count if Digit is 0
			else if (cc>0) //Digit is 1, If Count Isn't Zero
			{
				mc = (cc>mc) ? cc : mc; //Set Max Count if Count is Greater
				cc = 0; //Reset Count
			}
		}
			
		return mc; //Return Max Count
	}

}
