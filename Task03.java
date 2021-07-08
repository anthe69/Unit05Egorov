package by.epam.unit05.main;

public class Task03 {

	public static void main(String[] args) {

		// Написать метод(методы), определяющий, в каком из данных двух чисел
		// больше цифр.

		int a = 50;
		int b = 120;

		int res;

		res = maxCount(a, b);

		if (res == 1) {
			System.out.println("Больше цифр в первом числе");
		} else {
			if (res == 2) {
				System.out.println("Больше цифр во втором числе");
			} else {
				System.out.println("Количество цифр в обоих числах одинаково");
			}
		}

	}

	public static int maxCount(int a, int b) {

		int len_a = Integer.toString(a).length();
		int len_b = Integer.toString(b).length();
		int res;

		if (len_a > len_b) {
			res = 1;
		} else {
			if (len_b > len_a) {
				res = 2;
			} else {
				res = 3;
			}
		}

		return res;

	}

}
