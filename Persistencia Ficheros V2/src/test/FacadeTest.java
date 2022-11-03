package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.acceso.facade.Facade;
import modelo.data.Doctor;
import modelo.data.Lengua;
import modelo.data.Nacionalidad;
import modelo.data.Paciente;

class FacadeTest {
	Facade facade;

	@BeforeEach
	void beforeEach() {
		facade = new Facade();
	}

	@Test
	void testAddDoctor() {
		assertTrue(facade.add(new Doctor(1, "Luis", Lengua.aleman)));
		assertEquals(1, facade.findAllDoctors().size());
		
	}

	@Test
	void testAddPaciente() {
		assertTrue(facade.add(new Paciente("2","Eusebio",Nacionalidad.Frances)));
		assertEquals(1, facade.findAllPatients().size());
	}

	@AfterEach
	void afterEach() {
		File file = new File("doctores.data");
		if (file.exists()) {
			System.out.println("borrando doctores " + file.delete());
		}
		File fileDos = new File("pacientes.dat");
		if (fileDos.exists()) {
			System.out.println("borrando pacientes "+fileDos.delete() );
		}
		
	}
}
