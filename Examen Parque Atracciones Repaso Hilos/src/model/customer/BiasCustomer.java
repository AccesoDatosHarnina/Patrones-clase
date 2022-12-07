package model.customer;

import java.util.Random;

import control.WorkingDay;
import model.park.Fraction;
import modelAtractions.FairGround;

public class BiasCustomer  implements Runnable{
	// las ganas que tiene de montarse en otra atraccion depende de lo bien
	// que se lo este pasando, aunque todo tiene un limite de X veces
	private int maxRides;
	private int actualRides = 0;
	private float maxRate = 10;
	private float minimumEnjoyment = 5f;
	private Fraction currentEnjoyment = new Fraction();
	private long breakTime=1000;
	private WorkingDay workingDay;

	public BiasCustomer(int maxRides, WorkingDay workingDay) {
		super();
		this.maxRides = maxRides;
		// Al principio tiene muchas ganas
		currentEnjoyment.incrementOneValoration(10);
		this.workingDay=workingDay;
	}

	public CustomerCard takeRide() {
		FairGround fairGround=workingDay.randomFairGround();
		return new CustomerCard(fairGround,new Random().nextInt(10));
	}

	public float getCurrentValue() {
		return currentEnjoyment.getCurrentValue();
	}

	public boolean isStillExcited() {
		return this.currentEnjoyment.getCurrentValue() >= minimumEnjoyment;
	}



	@Override
	public void run() {
		do {
			CustomerCard takeRide = takeRide();
			//valorando la atraccion
			workingDay.evaluate(takeRide);
			//valorando mi disfrute
			currentEnjoyment.incrementOneValoration(takeRide.getRate());
			actualRides++;
		}while(isStillExcited()&&stillExperience());
	}

	private boolean stillExperience() {
		return actualRides<=maxRides;
	}

	

}
