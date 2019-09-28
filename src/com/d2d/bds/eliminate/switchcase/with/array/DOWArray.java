package com.d2d.bds.eliminate.switchcase.with.array;

public class DOWArray {
	
	public static String dayOfWeek(int day) {
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		return days[day-1];
	}
}
