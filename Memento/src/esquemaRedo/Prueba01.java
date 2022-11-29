package esquemaRedo;

import java.time.LocalDate;

public class Prueba01 {

	public static void main(String[] args) throws CloneNotSupportedException {
		State state=new State(1, "uno", new SubState(LocalDate.now(), "subuno"));
		State clon=state.clonar();
		state.getSubState().setName("original");
	}

}
