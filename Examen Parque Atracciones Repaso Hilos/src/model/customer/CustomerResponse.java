package model.customer;

import model.park.Fraction;

public class CustomerResponse {
	private Fraction currentEnjoyment;
	private int actualRides;

	public CustomerResponse(Fraction currentEnjoyment, int actualRides) {
		super();
		this.currentEnjoyment = currentEnjoyment;
		this.actualRides = actualRides;
	}

	public Fraction getCurrentEnjoyment() {
		return currentEnjoyment;
	}

	public int getActualRides() {
		return actualRides;
	}

}
