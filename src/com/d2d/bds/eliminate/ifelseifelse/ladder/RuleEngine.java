package com.d2d.bds.eliminate.ifelseifelse.ladder;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
	private static List<IRule> rules = new ArrayList<>();
	
	static {
		rules.add(new Sub100Units());
		rules.add(new Sub300Units());
		rules.add(new Sub500Units());
		rules.add(new Beyond500Units());
		rules.add(new ElectricityDutyCharge());
	}
	
	public static double calculateTariff(int units) {
		double tariff = 0;
		CustomerBill bill = new CustomerBill(units, tariff);
		for (IRule iRule : rules) {
			tariff += iRule.rule(bill);
		}
		bill.setTariff(tariff);
		return tariff;
	}
	
}
