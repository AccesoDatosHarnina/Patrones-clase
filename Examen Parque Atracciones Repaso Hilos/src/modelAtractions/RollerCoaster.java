package modelAtractions;

public class RollerCoaster implements FairGround{

	@Override
	public String saluda() {
		return "soy un roller Coaster";
	}
	@Override
	public FairGround dismantle() {
		return this;
	}
}
