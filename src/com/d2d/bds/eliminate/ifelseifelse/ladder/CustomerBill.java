package com.d2d.bds.eliminate.ifelseifelse.ladder;

public class CustomerBill {
	private int unitsConsumed;
	private double tariff;
	
	public CustomerBill(int unitsConsumed, double tariff) {
		super();
		this.unitsConsumed = unitsConsumed;
		this.tariff = tariff;
	}
	
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	
	@Override
	public String toString() {
		return "CustomerBill [unitsConsumed=" + unitsConsumed + ", tariff=" + tariff + "]";
	}
}
