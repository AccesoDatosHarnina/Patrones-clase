package teoria;

public class TresSingle {
	// Esta es la unica instancia de la clase
	//lazy load
		private static TresSingle INSTANCIA ;
		public int valor=0;

		// El constructor es privado
		private TresSingle() {
		}

		// Se accede a ella con un getter
		public static TresSingle getInstancia() {
			if(INSTANCIA==null) {
				INSTANCIA= new TresSingle();
			}
			return INSTANCIA;
		}

}
