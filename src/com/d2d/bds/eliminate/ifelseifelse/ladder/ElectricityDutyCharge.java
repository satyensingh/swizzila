package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class ElectricityDutyCharge implements IRule {

	@Override
	public double rule(Object input) {
		CustomerBill bill = ((CustomerBill)input);
		return bill.getTariff() * 0.16;
	}

}
