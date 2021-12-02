package 자바테스트;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		Random random = new Random();
		int i1 = random.nextInt(45) + 1;
		int i2 = random.nextInt(45) + 1;
		int i3 = random.nextInt(45) + 1;
		int i4 = random.nextInt(45) + 1;
		int i5 = random.nextInt(45) + 1;
		int i6 = random.nextInt(45) + 1;
		for (int s = 1; s <= 6; s++) {
			while (i1 != i2 && i1 != i3 && i1 != i4 && i1 != i5 && i1 != i6 && i2 != i3 && i2 != i4 && i2 != i5
					&& i2 != i6 && i3 != i4 && i3 != i5 && i3 != i6 && i4 != i5 && i4 != i6 && i5 != 6) {
				System.out.println("행운의 숫자 : " + i1);
				System.out.println("행운의 숫자 : " + i2);
				System.out.println("행운의 숫자 : " + i3);
				System.out.println("행운의 숫자 : " + i4);
				System.out.println("행운의 숫자 : " + i5);
				System.out.println("행운의 숫자 : " + i6);
				break;
				
			}
			break;
		}
	}
}