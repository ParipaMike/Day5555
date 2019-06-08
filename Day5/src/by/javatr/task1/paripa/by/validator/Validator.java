package by.javatr.task1.paripa.by.validator;

import by.javatr.task1.paripa.by.entity.Array;

public class Validator {
	private Validator(){
	}
	public static boolean isSize(int[] mass, int index){
		if (mass.length>=index){
			return true;
		}else{
			return false;
		}
	}
	

}
