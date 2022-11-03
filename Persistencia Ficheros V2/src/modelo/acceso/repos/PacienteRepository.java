package modelo.acceso.repos;

import java.util.ArrayList;
import java.util.List;

import concreteFactory.serializado.ConcreteFactorySerializadoUnitario;
import modelo.daos.collection.DaoLista;
import modelo.daos.collection.IDAOList;
import modelo.data.Paciente;

public class PacienteRepository {
	private IDAOList<ArrayList<Paciente>, Paciente, String> pacientes = new DaoLista<>("pacientes.pac",
			new ArrayList<Paciente>(),new ConcreteFactorySerializadoUnitario<>());
	
	public String obtenerIdPaciente() {
		return String.valueOf(pacientes.getSize());
	}

	public boolean add(Paciente s) {
		return pacientes.add(s);
	}

	public Paciente obtenerPaciente(String idPaciente) {
		return pacientes.getByPosition(Integer.valueOf(idPaciente));
	}
	
	public List getPacientes() {
		ArrayList<Paciente> resultado = new ArrayList<>();
		for (int i = 0; i < pacientes.getSize(); i++) {
			resultado.add(pacientes.getByPosition(i));
		}
		return resultado;
	}

}
