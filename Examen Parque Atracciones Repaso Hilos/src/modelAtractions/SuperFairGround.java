package modelAtractions;

public class SuperFairGround implements FairGround {

	FairGround fair;
	
	public SuperFairGround(FairGround fair) {
		super();
		this.fair = fair;
	}

	@Override
	public String saluda() {
		return fair.saluda()+" y ademas con luces";
	}

	@Override
	public FairGround dismantle() {
		return this.fair;
	}
}
