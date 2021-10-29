package solucion03Enum;

public enum TreatmentType {
	sand((coche) -> {
		((Coche) coche).setPulido(true);
	}), 
	prime((coche) -> {
		((Coche) coche).setImprimado(true);
	}), 
	paint((coche) -> {
		((Coche) coche).setPintado(true);
	});

	Handler handler;

	private TreatmentType(Handler handler) {
		this.handler = handler;
	}

	public static void treat(Object object) {
		TreatmentType[] values = TreatmentType.values();
		for (int i = 0; i < values.length; i++) {
			values[i].handler.handle(object);
		}
	}
}
