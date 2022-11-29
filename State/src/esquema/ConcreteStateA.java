package esquema;

public class ConcreteStateA implements State {

	private Context context;
	
	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public void doThis() {
		System.out.println("el a do this");
		System.out.println(context.getValue());
	}

	@Override
	public void doThat() {
		System.out.println("el a do this");
		System.out.println(context.getValue());
	}

}
