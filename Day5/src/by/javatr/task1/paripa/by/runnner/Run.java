package by.javatr.task1.paripa.by.runnner;

import java.util.Scanner;

import by.javatr.task1.paripa.by.entity.Array;
import by.javatr.task1.paripa.by.logic.Search;
import by.javatr.task1.paripa.by.logic.Sort;

public class Run {

	public static void main(String[] args) {
		Array a = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите элементы массива с клавиатуры:");
		for (int i = 0; i < a.size(); i++) {
			a.addElement(sc.nextInt());
		}
		Sort.selectionSort(a);
		System.out.print(a.toString());
		System.out.print("\n" + Search.binarySearch(a, 0, a.size() - 1, 3)
				+ "\n");
		System.out.println(Search.getMax(a));
		System.out.println(Search.getMin(a));
		Array b = new Array();
		final int min = 10; // Минимальное число для диапазона
		final int max = 75; // Максимальное число для диапазона
		final int rnd = rnd(min, max);
		for (int i = 0; i < a.size(); i++) {
			b.addElement(rnd(min, max));
		}
		System.out.println(b.toString());
	}

	public static int rnd(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}

}
