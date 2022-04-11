package com.sapient.day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClass {
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add(1);
		list.add(-2);
		list.add(-8);
		System.out.println(list);
		list.sort(new Comparator()){
			
			public int compare(Object number1, Object number2) {
				return((Integer)number1-(Integer)number2);
			}
		}
		
	}

}
