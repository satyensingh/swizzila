package com.d2d.bds.eliminate.switchcase.with.hashtable;

import java.util.Hashtable;

public class KeyCodeHashtable {
	public static String getKeyMap(int keycode) {
		String code = "";
		
		Hashtable<Integer, String> keyCode = new Hashtable<>();
		keyCode.put(37, "{left}");
		keyCode.put(38, "{up}");
		keyCode.put(39, "{right}");
		keyCode.put(40, "{down}");
		
		code = keyCode.get(keycode);
		return code;
	}
}
