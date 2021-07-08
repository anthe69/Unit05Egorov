package by.epam.unit05.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {

		// Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4]
		// + D[5]; D[4] +D[5] +D[6].
		// Пояснение. Составить метод(методы) для вычисления суммы трех
		// последовательно расположенных элементов массива с номерами от k до m.

		int ar[] = new int[10];
		int k = 3;
		int m = 5;
		int res;

		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}

		System.out.println("Исходный массив:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		System.out.println();

		res = sum(ar, k, m);
		
		System.out.println("Сумма элементов от k до m = " + res);

	}

	public static int sum(int ar[], int k, int m) {

		int res = 0;

		for (int i = k - 1; i <= m - 1; i++) {
			res = res + ar[i];
		}

		return res;

	}

}
