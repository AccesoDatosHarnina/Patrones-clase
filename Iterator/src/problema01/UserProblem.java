package problema01;

import java.util.HashSet;

public class UserProblem {
public static void main(String[] args) {
	HashSet<Departamento> departamentos=new HashSet<>();
	Departamento e = new Departamento(1,"Informatica");
	e.getEmpleados().add(new Empleado(1, "Tomas"));
	e.getEmpleados().add(new Empleado(2, "Luis"));
	e.getEmpleados().add(new Empleado(3, "Amalia"));
	e.getEmpleados().add(new Empleado(4, "Juanilla"));
	departamentos.add(e);
	for (Departamento departamento : departamentos) {
		for (Empleado empleado : departamento.getEmpleados()) {
			System.out.println(empleado.toString());;
		}
	}
}
}
