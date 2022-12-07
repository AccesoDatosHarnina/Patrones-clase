package modelAtractions;

public class PerformanceProductor implements AbstractProductor{

	@Override
	public FairGround createFairGround() {
		return new Performance();
	}

}
