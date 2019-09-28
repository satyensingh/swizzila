package com.d2d.bds.eliminate.switchcase.with.hashtable;

public class Test {

	public static void main(String[] args) {
		System.out.println(KeyCode.getKeyMap(37));
		System.out.println(KeyCodeHashtable.getKeyMap(37));
		System.out.println(KeyCodeLoadFromFile.getKeyMap(37));
	}

}
