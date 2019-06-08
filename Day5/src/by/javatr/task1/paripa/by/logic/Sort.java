package by.javatr.task1.paripa.by.logic;

import by.javatr.task1.paripa.by.entity.Array;

public class Sort {
	private Sort() {

	}

	public static int[] bubbleSorter(Array a) {
		int temp;
		for (int i = a.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a.getIndex(j) > a.getIndex(j + 1)) {
					temp = a.getIndex(j);
					a.setIndexElement(j, a.getIndex(j + 1));
					a.setIndexElement(j + 1, temp);
				}
			}
		}
		return a.getMass();
	}

	public static int[] insertionSort(Array a) {
		for (int left = 0; left < a.size(); left++) {
			int value = a.getIndex(left);
			int i = left - 1;
			for (; i >= 0; i--) {
				if (value < a.getIndex(i)) {
					a.setIndexElement(i + 1, a.getIndex(i));
				} else {
					break;
				}
			}
			a.setIndexElement(i + 1, value);
		}
		return a.getMass();
	}

	public static int[] selectionSort(Array a) {
		for (int min = 0; min < a.size() - 1; min++) {
			int least = min;
			for (int j = min + 1; j < a.size(); j++) {
				if (a.getIndex(j) < a.getIndex(least)) {
					least = j;
				}
			}
			int tmp = a.getIndex(min);
			a.setIndexElement(min, a.getIndex(least));
			a.setIndexElement(least, tmp);
		}
		return a.getMass();
	}
}
