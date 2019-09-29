package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class Sub500Units implements IRule {

	@Override
	public double rule(Object units) {
		int unitsConsumed = ((CustomerBill) units).getUnitsConsumed();
		int localUnits = unitsConsumed - 300;
		if (unitsConsumed > 300 && unitsConsumed <= 500)
			return localUnits * 6.75;
		else if (unitsConsumed > 500)
			return 300 * 6.75;
		return 0;
	}

}
