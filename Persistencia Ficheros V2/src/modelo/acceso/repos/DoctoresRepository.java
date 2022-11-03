package modelo.acceso.repos;

import java.util.ArrayList;
import java.util.HashMap;

import concreteFactory.serializado.ConcreteFactorySerializadoUnitario;
import modelo.daos.collection.DaoLista;
import modelo.daos.collection.IDAOList;
import modelo.data.Consulta;
import modelo.data.Doctor;
import modelo.data.Lengua;

public class DoctoresRepository {
	private IDAOList<ArrayList<Doctor>, Doctor, Integer> doctores = new DaoLista<>("doctores.dr",
			new ArrayList<Doctor>(),new ConcreteFactorySerializadoUnitario<>());
	
	public ArrayList<Doctor> getAllDoctors() {
		ArrayList<Doctor> medicos = new ArrayList<>();
		int posicion = 0;
		Doctor doctor = doctores.getByPosition(posicion);
		while (doctor != null) {
			medicos.add(doctor);
			doctor = doctores.getByPosition(++posicion);
		}
		return medicos;
	}
	

	Doctor getDoctorByLengua(Lengua lengua) {
		for (int i = 0; i < doctores.getSize(); i++) {
			Doctor doctor = doctores.getByPosition(i);
			if (doctor.getSegunda() == lengua) {
				return doctor;
			}
		}
		return null;
	}


}
