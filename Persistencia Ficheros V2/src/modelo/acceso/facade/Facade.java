package modelo.acceso.facade;

import java.util.ArrayList;
import java.util.List;

import modelo.acceso.repos.ConsultasRepository;
import modelo.acceso.repos.DoctoresRepository;
import modelo.acceso.repos.PacienteRepository;
import modelo.data.Consulta;
import modelo.data.Doctor;
import modelo.data.Paciente;

public class Facade {
	private DoctoresRepository doctoresRepository = new DoctoresRepository();
	private ConsultasRepository consultasRepository = new ConsultasRepository();
	private PacienteRepository pacienteRepository = new PacienteRepository();
	
	public boolean add(Consulta consulta) {
		return consultasRepository.add(consulta);
	}

	public boolean add(Paciente s) {
		return pacienteRepository.add(s);
	}

	public ArrayList<Consulta> getConsultas() {
		return consultasRepository.getConsultas();
	}

	public ArrayList<Doctor> getAllDoctors() {
		return doctoresRepository.getAllDoctors();
	}

	public String obtenerIdPaciente() {
		return pacienteRepository.obtenerIdPaciente();
	}

	public Paciente obtenerPaciente(String idPaciente) {
		return pacienteRepository.obtenerPaciente(idPaciente);
	}

	public List getPacientes() {
		return pacienteRepository.getPacientes();
	}

	public ArrayList<Consulta> getConsultasByDoctor(Integer idMedico) {
		//TODO
		return null;
	}

	public Doctor obtenerDoctorFromConsultas(Paciente paciente) {
		//TODO
		return null;
	}

}
