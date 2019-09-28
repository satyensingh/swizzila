package com.d2d.bds.eliminate.switchcase.with.hashtable;

import java.util.ResourceBundle;

public class KeyCodeLoadFromFile {

	private static ResourceBundle bundle;

	public static String getKeyMap(int keycode) {
		String code = "";
		bundle = ResourceBundle.getBundle("com.d2d.bds.eliminate.switchcase.with.hashtable.data");
		code = bundle.getString("" + keycode);
		return code;
	}
}
