package com.d2d.bds.eliminate.switchcase.with.function;

import java.util.HashMap;
import java.util.function.Function;

public class ChangeCaseFunction {
	
	private static HashMap<Case, Function<String[], String>> cases;
	
	public enum Case {
		Lower, Upper, Pascal, Camel, Kebab
	};

	static {
		cases = new HashMap<>();
		cases.put(Case.Camel, word -> camel(word));
		cases.put(Case.Pascal, word -> pascal(word));
		cases.put(Case.Lower, word -> lower(word));
		cases.put(Case.Upper, word -> upper(word));
		cases.put(Case.Kebab, word -> kebab(word));
	}

	public static String convert(Case cas, String[] words) {
		return cases.get(cas).apply(words);
	}
	
	private static String kebab(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++) {
			outstring += words[i].substring(0).toLowerCase();
			outstring += "-";
		}
		return outstring.substring(0, outstring.length()-1);
	}
	
	private static String camel(String[] words) {
		String outstring = words[0].toLowerCase();
		for (int i = 1; i < words.length; i++) {
			outstring += words[i].substring(0, 1).toUpperCase();
			outstring += words[i].substring(1).toLowerCase();
		}
		return outstring;
	}

	private static String pascal(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++) {
			outstring += words[i].substring(0, 1).toUpperCase();
			outstring += words[i].substring(1).toLowerCase();
		}
		return outstring;
	}

	private static String upper(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++)
			outstring += words[i].toUpperCase();
		return outstring;
	}

	private static String lower(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++)
			outstring += words[i].toLowerCase();
		return outstring;
	}
}