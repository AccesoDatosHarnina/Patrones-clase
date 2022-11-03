package facade;

import concreteFactory.ConcreteFactorySerializadoUnitario;
import model.data.Doctor;
import model.data.Paciente;
import repostiories.DoctorRepositorio;
import repostiories.PacienteRepositorio;

public class Facade {
	
	private DoctorRepositorio doctorRepositorio=
			new DoctorRepositorio(new ConcreteFactorySerializadoUnitario<>());
	private PacienteRepositorio pacienteRepositorio=new PacienteRepositorio();

	public boolean add(Doctor s) {
		return doctorRepositorio.add(s);
	}

	public boolean add(Paciente t) {
		return pacienteRepositorio.add(t);
	}
	
//	public Optional<List<Consultas>> findConsultasByDoctor(String doctorKey){
//		Doctor doctor=doctorRepositorio.findByKey(doctorKey);
//		return consultasRepositorio.findByDoctor(doctor);
//	}
	
}
