package modelAtractions;

public class Show implements FairGround {

	@Override
	public String saluda() {
		return "soy un show";
	}

	@Override
	public FairGround dismantle() {
		return this;
	}
}
