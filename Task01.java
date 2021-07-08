package by.epam.unit05.main;

public class Task01 {

	public static void main(String[] args) {
		
		// Написать метод(методы) для нахождения наибольшего общего делителя и
		// наименьшего общего кратного двух натуральных чисел.

		int a = 5;
		int b = 12;

		int nod;
		int nok;

		nod = nod(a, b);
		nok = a * b / nod;

		System.out.printf("A=%1s, B=%1s, НОК(A,B)=%1s, НОД(A,B)=%1s", a, b, nok, nod);

	}

	public static int nod(int a, int b) {

		int min;
		int res = 0;

		if (a > b) {
			min = b;
		} else {
			min = a;
		}

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				res = i;
			}
		}

		return res;

	}

}
