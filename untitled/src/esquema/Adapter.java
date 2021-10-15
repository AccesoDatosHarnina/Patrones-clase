package esquema;

public class Adapter implements ClientInterface {

	Service service=new Service();
	
	
	@Override
	public void method(Data data) {
		service.serviceMethod(convertToServiceFormat(data));

	}

	private SpecialData convertToServiceFormat(Data data) {
		return new SpecialData(Integer.valueOf(data.aString));
	}
}
