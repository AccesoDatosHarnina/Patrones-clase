package esquema;


public class ConcreteA extends BaseHandler{

	@Override
	public void handle(RequestCDR request) {
		//I can handle
		if(request.getValue()==1) {
			System.out.println("soy el concrete A y soluciono esto");
		}else {
			super.handle(request);
		}
	}
	
}
