package com.d2d.bds.eliminate.switchcase.with.interfac;

public class UpperCase implements IAction {

	@Override
	public String convert(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++)
			outstring += words[i].toUpperCase();
		return outstring;
	}
}
