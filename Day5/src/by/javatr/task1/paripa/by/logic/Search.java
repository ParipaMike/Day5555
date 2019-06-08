package by.javatr.task1.paripa.by.logic;

import by.javatr.task1.paripa.by.entity.Array;
import by.javatr.task1.paripa.by.finals.Const;

public class Search {
	private Search() {

	}

	public static String binarySearch(Array array, int first, int last, int item) {
		String s;
		int position;
		int comparisonCount = 1;
		position = (first + last) / 2;

		while ((array.getIndex(position) != item) && (first <= last)) {
			comparisonCount++;
			if (array.getIndex(position) > item) {
				last = position - 1;
			} else {
				first = position + 1;
			}
			position = (first + last) / 2;
		}
		if (first <= last) {
			s = item + " €вл€етс€ " + ++position + " элементом в массиве";
			s += "\nћетод бинарного поиска нашел число после "
					+ comparisonCount + " сравнений";
		} else {
			s = "Ёлемент не найден в массиве. ћетод бинарного поиска закончил работу после "
					+ comparisonCount + " сравнений";
		}
		return s;
	}

	public static int getMax(Array a) {
		int max = a.getIndex(Const.FIRST);
		for (int i = 1; i < a.size(); i++) {
			if (max < a.getIndex(i)) {
				max = a.getIndex(i);
			}
		}
		return max;
	}

	public static int getMin(Array a) {
		int min = a.getIndex(Const.FIRST);
		for (int i = 1; i < a.size(); i++) {
			if (min > a.getIndex(i)) {
				min = a.getIndex(i);
			}
		}
		return min;
	}
}
