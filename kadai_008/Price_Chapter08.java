package kadai_008;

import java.util.Scanner;

public class Price_Chapter08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//年代を入力
		int userAge = sc.nextInt();
		System.out.println(userAge + "代");

		int serviseCost = (int) (userAge);

		switch (serviseCost) {
		case 10 -> System.out.println(1000 + "円");
		case 20 -> System.out.println(2000 + "円");
		case 30, 40 -> System.out.println(3000 + "円");
		case 50, 60, 70 -> System.out.println(4000 + "円");
		case 80 -> System.out.println(5000 + "円");
		default -> System.out.println(500 + "円");

		}

	}

}
