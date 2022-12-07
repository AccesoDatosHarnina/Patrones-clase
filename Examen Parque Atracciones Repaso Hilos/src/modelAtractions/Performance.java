package modelAtractions;

public class Performance implements FairGround  {

	@Override
	public String saluda() {
		return "soy una performance";
	}

	@Override
	public FairGround dismantle() {
		return this;
	}

	
}
