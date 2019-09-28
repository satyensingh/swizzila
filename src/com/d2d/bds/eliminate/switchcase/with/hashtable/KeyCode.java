package com.d2d.bds.eliminate.switchcase.with.hashtable;

public class KeyCode {
	public static String getKeyMap(int keycode) {
		String code = "";
		switch (keycode) {
		case 37:
			code = "{left}";
			break;

		case 38:
			code = "{up}";
			break;

		case 39:
			code = "{right}";
			break;

		case 40:
			code = "{down}";
			break;
		}
		return code;
	}
}