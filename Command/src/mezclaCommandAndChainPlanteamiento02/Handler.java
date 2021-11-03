package mezclaCommandAndChainPlanteamiento02;

public interface Handler {

	public void setNext(Handler handlerc);
	public void handle(Coche request);
}
