package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class Sub300Units implements IRule {

	@Override
	public double rule(Object units) {
		int unitsConsumed = ((CustomerBill)units).getUnitsConsumed();
		int localUnits = unitsConsumed - 100;
		if (unitsConsumed > 200 && unitsConsumed <= 300)
			return localUnits * 4.05;
		else if(unitsConsumed > 300)
			return 200 * 4.05;
		return 0;
	}

}
