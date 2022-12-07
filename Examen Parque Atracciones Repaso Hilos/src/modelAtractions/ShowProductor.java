package modelAtractions;

public class ShowProductor implements AbstractProductor {

	@Override
	public FairGround createFairGround() {
		return new Show();
	}

}
