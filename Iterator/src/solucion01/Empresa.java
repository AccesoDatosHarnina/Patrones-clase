package solucion01;

import java.util.HashSet;

import problema01.Departamento;
import problema01.Empleado;

public class Empresa {
	HashSet<Departamento> departamentos=new HashSet<>();

	public Empresa() {
		super();
		Departamento e = new Departamento(1,"Informatica");
		e.getEmpleados().add(new Empleado(1, "Tomas"));
		e.getEmpleados().add(new Empleado(2, "Luis"));
		e.getEmpleados().add(new Empleado(3, "Amalia"));
		e.getEmpleados().add(new Empleado(4, "Juanilla"));
		departamentos.add(e);
	}
	
}
