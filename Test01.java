package 자바테스트;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		Random random = new Random();
		int num1 = 0;
		int max = 0;
		int min = 100;
		int arr[] = new int[8];
		System.out.print("배열에 있는 모든 값: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100)+1 ;
			
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		System.out.print(arr[i]+" ");

	}
		System.out.println();
		System.out.println("가장 큰 값: " + max);
		System.out.println("가장 작은 값: " + min);
}
}