package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class Sub100Units implements IRule {

	@Override
	public double rule(Object units) {
		int unitsConsumed = ((CustomerBill)units).getUnitsConsumed();
		if (unitsConsumed > 0 && unitsConsumed <= 100)
			return unitsConsumed * 1.35;
		else
			return 100 * 1.35;
	}

}
