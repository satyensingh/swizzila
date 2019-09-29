package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class Beyond500Units implements IRule {

	@Override
	public double rule(Object units) {
		int unitsConsumed = ((CustomerBill) units).getUnitsConsumed();
		int localUnits = unitsConsumed - 500;
		if(unitsConsumed > 500)
			return localUnits * 8.0;
		return 0;
	}

}
