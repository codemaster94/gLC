package codility;

//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		/*for(int i = 0; i < a.length; i++) {
			
			if(map.containsKey(a[i])) {
				int val = map.get(a[i]);
				map.put(a[i], val + 1);
			}
			else
				map.put(a[i], 1);
		}
		int flag = -1;
		for(int count : map.keySet()) {
			
			if(map.get(count) % 2 != 0)
				flag = count;
		}
		
		System.out.println(flag);*/
		int res = 0;
		for(int i = 0; i < a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println(res);
		sc.close();
	}

}
