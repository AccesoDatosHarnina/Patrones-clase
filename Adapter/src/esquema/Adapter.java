package esquema;

public class Adapter implements ClientInterface {

	Service service;

	public Adapter(Service service) {
		this.service = service;
	}

	@Override
	public void method(Data data) {
		service.serviceMethod(convertToServiceFormat(data));

	}

	private SpecialData convertToServiceFormat(Data data) {
		return new SpecialData(Integer.valueOf(data.aString));
	}
}
