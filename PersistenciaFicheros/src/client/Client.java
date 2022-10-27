package client;

import java.util.ArrayList;

import acceso.collection.AccesoConcreteCollection;
import acceso.multiobjeto.AccessoConcreteMultiObjetosSerializado;
import base.GrabadorSerializado;
import base.RecuperadorIndexadoSerializado;
import base.RecuperadorUnitarioSerializado;
import dao.abstracta.lista.DAOAbstractLista;
import dao.abstracto.multiobjeto.DaoAbstractMultiObjetos;
import dao.concretas.lista.DaoConcreteLista;
import dao.concreto.multiobjeto.DaoConcreteMultiObjetos;
import model.data.Doctor;
import model.data.Paciente;

public class Client {
	public static void main(String[] args) {
//		facade.add(new Doctor);
//		facade.getDoctor(k);
		ArrayList<Doctor> doctores=new ArrayList<Doctor>();
		String path = "doctores.data";
		DAOAbstractLista<ArrayList<Doctor>, Doctor, Integer> daoDoctor=
				new DaoConcreteLista<ArrayList<Doctor>, Doctor, Integer>
		(path, doctores, new AccesoConcreteCollection<ArrayList<Doctor>>
		(path, new RecuperadorUnitarioSerializado<ArrayList<Doctor>>()
				, new GrabadorSerializado<ArrayList<Doctor>>()));
		
		DaoAbstractMultiObjetos<Paciente, String> pacientes = 
				new DaoConcreteMultiObjetos<Paciente, String>("consultas.dat",
				new AccessoConcreteMultiObjetosSerializado<Paciente, String>
				("consultas.dat", new GrabadorSerializado<>(),
						new RecuperadorIndexadoSerializado<>()));
	}
}
