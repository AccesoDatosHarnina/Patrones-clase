package repostiories;

import acceso.multiobjeto.AccessoConcreteMultiObjetosSerializado;
import concreteProducts.GrabadorSerializado;
import concreteProducts.RecuperadorIndexadoSerializado;
import dao.abstracto.multiobjeto.DaoAbstractMultiObjetos;
import dao.concreto.multiobjeto.DaoConcreteMultiObjetos;
import model.data.Paciente;

public class PacienteRepositorio {
	public DaoAbstractMultiObjetos<Paciente, String> daoPacientes = 
			new DaoConcreteMultiObjetos<Paciente, String>("consultas.dat",
			new AccessoConcreteMultiObjetosSerializado<Paciente, String>
			("consultas.dat", new GrabadorSerializado<>(),
					new RecuperadorIndexadoSerializado<>()));

	public boolean add(Paciente t) {
		return daoPacientes.add(t);
	}
	
}
