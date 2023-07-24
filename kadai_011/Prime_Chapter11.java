package kadai_011;

public class Prime_Chapter11 {
	public static void main(String[] args) {

		int maxNumber = 100;
		boolean[] prime = new boolean[maxNumber + 1];

		//初期化
		for (int i = 2; i <= maxNumber; i++) {
			prime[i] = true;
		}
		//素数の判定
		for (int i = 2; i * i <= maxNumber; i++) {
			if (prime[i]) {
				for (int a = i * i; a <= maxNumber; a += i) {
					prime[a] = false;
				}
			}
		}
		//結果の出力
		for (int i = 2; i <= maxNumber; i++) {
			if (prime[i]) {
				System.out.println(i + "" + prime[i]);
			}
		}

	}
}
