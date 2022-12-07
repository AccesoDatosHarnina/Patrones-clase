package model.customer;

import modelAtractions.FairGround;

public class CustomerCard {

	private FairGround fairGround;
	private float rate;
	
	public CustomerCard(FairGround fairGround, float rate) {
		super();
		this.fairGround = fairGround;
		this.rate = rate;
	}

	public FairGround getFairGround() {
		return fairGround;
	}

	public float getRate() {
		return rate;
	}

	
	
	
}
