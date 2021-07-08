package by.epam.unit05.main;

public class Task02 {

	public static void main(String[] args) {
		
		// Написать метод(методы) для нахождения суммы большего и меньшего из
		// трех чисел.

		int a = 5;
		int b = 12;
		int c = 3;
		
		int res;

		res = sumMaxMin(a, b, c);

		System.out.println("Сумма большего и меньшего из трех чисел равна " + res);

	}

	public static int sumMaxMin(int a, int b, int c) {

		int max = 0;
		int min = 0;

		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					min = c;
				} else {
					min = b;
				}
			}
		} else {
			if (b > c) {
				max = b;
				if (c > a) {
					min = a;
				} else {
					min = c;
				}
			} else {
				max = c;
			}
		}

		return max + min;

	}

}
