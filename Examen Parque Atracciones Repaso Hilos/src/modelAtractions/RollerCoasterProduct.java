package modelAtractions;

public class RollerCoasterProduct implements AbstractProductor {

	@Override
	public FairGround createFairGround() {
		return new RollerCoaster();
	}

}
