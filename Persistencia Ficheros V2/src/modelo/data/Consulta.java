package modelo.data;

import java.io.Serializable;
import java.time.LocalDate;

import modelo.acceso.multi.Indicable;

public class Consulta implements Serializable, Indicable<Integer> {
	private int id;
	private Paciente paciente;
	private LocalDate fecha;
	private Doctor doctor;

	public Consulta(int id, Paciente paciente, Doctor doctor) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.doctor = doctor;
	}

	public int getId() {
		return id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	@Override
	public Integer getKey() {
		return id;
	}

	@Override
	public void setKey(Integer t) {
		id = t;
	}

}
