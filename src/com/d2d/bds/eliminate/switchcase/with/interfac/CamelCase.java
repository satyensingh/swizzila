package com.d2d.bds.eliminate.switchcase.with.interfac;

public class CamelCase implements IAction {

	@Override
	public String convert(String[] words) {
		String outstring = "";
		outstring += words[0].toLowerCase();
		for (int i = 1; i < words.length; i++) {
			outstring += words[i].substring(0, 1).toUpperCase();
			outstring += words[i].substring(1).toLowerCase();
		}
		return outstring;
	}
}
