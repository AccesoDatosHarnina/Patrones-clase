package model.park;

public class Fraction {
	private float enumerator=0f;
	private float denominator=0f;

	public void incrementOneValoration(float value) {
		incrementEnumerator(value);
		incremenentDenominator(1);
	}
	
	public float getCurrentValue() {
		return enumerator/denominator;
	}

	private void incrementEnumerator(float value) {
		enumerator += value;
	}

	private void incremenentDenominator(float value) {
		denominator += value;
	}
}
