package by.javatr.task1.paripa.by.entity;

import by.javatr.task1.paripa.by.finals.Const;
import by.javatr.task1.paripa.by.validator.Validator;

public class Array {

	private int[] mass;
	private int count;

	public Array() {
		this.mass = new int[Const.SIZE];
		count = 0;
	}

	public Array(int size) {
		this.mass = new int[size];
		count = 0;
	}

	public Array(int[] mass) {
		this.mass = mass;
	}

	public int size() {
		return mass.length;
	}

	public int getIndex(int index) {
		if (Validator.isSize(mass, index)) {
			return mass[index];
		} else {
			return -1;
		}
	}

	public void setIndexElement(int index, int element) {
		if (Validator.isSize(mass, index)) {
			this.mass[index] = element;
		}
	}

	public boolean addElement(int element) {
		if (Validator.isSize(mass, count)) {
			mass[count] = element;
			count++;
			return true;
		} else {
			return false;
		}
	}

	public final int[] getMass() {
		return mass;
	}

	public final void setMass(int[] mass) {
		this.mass = mass;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		int sum = 0;
		for (int i = 0; i < size(); i++) {
			sum += mass[i];
		}
		result = prime * result + count + sum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (count != other.count)
			return false;
		boolean flag = true;
		for (int i = 0; i < size(); i++) {
			if (this.mass[i] != other.getIndex(i)) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			s.append(mass[i]).append(" ");
		}
		return s.toString();
	}
}
