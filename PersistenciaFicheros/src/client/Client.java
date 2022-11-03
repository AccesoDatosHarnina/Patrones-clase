package client;

import facade.Facade;
import model.data.Doctor;
import model.data.Lengua;
import model.data.Nacionalidad;
import model.data.Paciente;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.add(new Doctor(1, "Fulgencio", Lengua.aleman));
		facade.add(new Paciente("1", "Roberto", Nacionalidad.Aleman));
	}
}
