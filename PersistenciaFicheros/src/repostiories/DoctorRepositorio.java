package repostiories;

import java.util.ArrayList;
import java.util.List;

import abstractFactory.AbstractAccess;
import abstractProduct.IRecuperadorUnitario;
import acceso.collection.AccesoConcreteCollection;
import concreteProducts.GrabadorSerializado;
import concreteProducts.RecuperadorUnitarioSerializado;
import dao.abstracta.lista.DAOAbstractLista;
import dao.concretas.lista.DaoConcreteLista;
import model.data.Doctor;

public class DoctorRepositorio {
	ArrayList<Doctor> doctores=new ArrayList<Doctor>();
	String path = "doctores.data";
	public DAOAbstractLista<List<Doctor>, Doctor, Integer> daoDoctor;
	
	
	
	public DoctorRepositorio(AbstractAccess<Doctor> a) {
		super();
		daoDoctor=
				new DaoConcreteLista<List<Doctor>, Doctor, Integer>
		(path, doctores, new AccesoConcreteCollection<List<Doctor>>
		(path, (IRecuperadorUnitario<List<Doctor>>) a.getRecuperador(), a.getGrabador()));
	}
	
	public boolean add(Doctor s) {
		return daoDoctor.add(s);
	}
	public Doctor findByKey(String doctorKey) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
