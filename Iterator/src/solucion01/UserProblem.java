package solucion01;

import java.util.HashSet;

import esquema.Iterator;
import problema01.Empleado;

public class UserProblem {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Iterator<Empleado> iterator = empresa.createIterator();
	}
}
