package model.park;

import java.util.Observable;

import modelAtractions.FairGround;
import utils.Comment;

public class FairGroundObservable extends Observable {
	private FairGround fairGround;
	private Fraction fraction;
	private double changeValueHigh = 7;
	private boolean changeHigh = false;
	private double changeValueLow = 4;
	private boolean changeLow = true;

	public FairGroundObservable(FairGround fairGround, Statistics statistics) {
		super();
		this.fairGround = fairGround;
		this.fraction = new Fraction();
		this.fraction.incrementOneValoration(5);
		addObserver(statistics);
	}

	public void incrementOneValoration(float rate) {
		fraction.incrementOneValoration(rate);
		float currentValue = fraction.getCurrentValue();
		Comment.talk("current rate " + currentValue);
		if (!changeHigh && currentValue >= changeValueHigh) {
			changeHigh = true;
			changeLow = false;
			notification();
			Comment.talk("cambiando a super");
		}
		if (!changeLow && currentValue <= changeValueLow) {
			changeLow = true;
			changeHigh = false;
			Comment.talk("cambiando a normal");
			notification();
		}
	}

	private void notification() {
		setChanged();
		notifyObservers(fairGround);
	}

	public boolean isChangeHigh() {
		return changeHigh;
	}

	public void setFairGround(FairGround fairGround) {
		this.fairGround = fairGround;
	}

	public float getCurrentValoration() {
		return this.fraction.getCurrentValue();
	}
}
