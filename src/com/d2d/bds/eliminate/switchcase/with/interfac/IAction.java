package com.d2d.bds.eliminate.switchcase.with.interfac;

public interface IAction {
	String convert(String[] words);
}
//
//class Lower implements IAction {
//
//	@Override
//	public String convert(Case cas, String[] words) {
//		String outstring = "";
//		for (int i = 0; i < words.length; i++)
//			outstring += words[i].toLowerCase();
//		return outstring;
//	}
//}
//
//class Pascal implements IAction {
//
//	@Override
//	public String convert(Case cas, String[] words) {
//		String outstring = "";
//		for (int i = 0; i < words.length; i++) {
//			outstring += words[i].substring(0, 1).toUpperCase();
//			outstring += words[i].substring(1).toLowerCase();
//		}
//		return outstring;
//	}
//	
//}
//
//class Kebab implements IAction {
//
//	@Override
//	public String convert(Case cas, String[] words) {
//		String outstring = "";
//		for (int i = 0; i < words.length; i++) {
//			outstring += words[i].substring(0).toLowerCase();
//			outstring += "-";
//		}
//		return outstring.substring(0, outstring.length()-1);
//	}
//	
//}