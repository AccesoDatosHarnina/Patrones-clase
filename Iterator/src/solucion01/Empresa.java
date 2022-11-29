package solucion01;

import java.util.ArrayList;
import java.util.HashSet;

import problema01.Departamento;
import problema01.Empleado;

public class Empresa implements IterableCollection<Empleado>, Iterator {
	HashSet<Departamento> departamentos=new HashSet<>();

	ArrayList<Empleado> empleados=new ArrayList<>();
	int empleadosIndex=0;
	public Empresa() {
		super();
		Departamento e = new Departamento(1,"Informatica");
		e.getEmpleados().add(new Empleado(1, "Tomas"));
		e.getEmpleados().add(new Empleado(2, "Luis"));
		e.getEmpleados().add(new Empleado(3, "Amalia"));
		e.getEmpleados().add(new Empleado(4, "Juanilla"));
		departamentos.add(e);
	}

	@Override
	public Iterator<Empleado> createIterator() {
		cargarEmpleados();
		this.empleadosIndex=0;
		Iterator<Empleado> mIterator=new Iterator<Empleado>() {
			java.util.Iterator<Empleado> iterator = empleados.iterator();
			@Override
			public boolean hasMore() {
				return iterator.hasNext();
			}
			
			@Override
			public Empleado getNext() {
				return iterator.next();
			}
		};
		return mIterator;
	}

	private void cargarEmpleados() {
		 java.util.Iterator<Departamento> iteratorDepartamentos = departamentos.iterator();
		 do {
			 Departamento departamento = iteratorDepartamentos.next();
			 java.util.Iterator<Empleado> misEmpleados = departamento.getEmpleados().iterator();
			 do {
				 Empleado next = misEmpleados.next();
				 this.empleados.add(next);
			 }while(misEmpleados.hasNext());
		 }while(iteratorDepartamentos.hasNext());
	}

	@Override
	public Object getNext() {
		return this.empleados.get(empleadosIndex++);
	}

	@Override
	public boolean hasMore() {
		return this.empleados.size()>empleadosIndex;
	}
	
}
