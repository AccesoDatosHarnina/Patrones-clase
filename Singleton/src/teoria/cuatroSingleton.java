package teoria;


public class cuatroSingleton {

	
	//Creamos la propiedad que es la propia clase
	private static cuatroSingleton INSTANCIA =null;
	//En este caso es null porque aún no la hemos creado es de creacion diferida
	//Solo se crea cuando algo lo necesita
	private cuatroSingleton(){}
	
	public static cuatroSingleton getInstancia(){
		//Ahorramos  procesador si no abrimos una zona critica
		//cada vez que un hilo intenta acceder a el
		if(INSTANCIA==null){
			synchronized (cuatroSingleton.class) {
				if(INSTANCIA==null)
					INSTANCIA=new cuatroSingleton();				
			}
		
		}
		return INSTANCIA;
	}
}
