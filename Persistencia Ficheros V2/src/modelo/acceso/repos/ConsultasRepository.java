package modelo.acceso.repos;

import java.util.ArrayList;

import concreteFactory.serializado.ConcreteFactorySerializadoIndexado;
import concreteProducts.serializado.GrabadorSerializado;
import concreteProducts.serializado.RecuperadorIndexadoSerializado;
import modelo.acceso.multi.AccessMultiObjetosSerializado;
import modelo.acceso.multi.IAccessMultiObjects;
import modelo.daos.multi.DaoMultiObjetos;
import modelo.daos.multi.IDAOMultiObjects;
import modelo.data.Consulta;

public class ConsultasRepository {
	private ConcreteFactorySerializadoIndexado<Consulta, Integer> concreteFactorySerializadoIndexado;

	private IDAOMultiObjects<Consulta, Integer> consultas;	
	
	public ConsultasRepository() {
		super();
		concreteFactorySerializadoIndexado = new ConcreteFactorySerializadoIndexado<Consulta, Integer>();
		consultas = new DaoMultiObjetos<Consulta, Integer>("consultas.dat", concreteFactorySerializadoIndexado);
	}

	private int obtenerIDConsulta() {
		ArrayList<Consulta> consultas2 = getConsultas();
		return consultas2.size();
	}

	public boolean add(Consulta consulta) {
		return consultas.add(consulta);
	}

	public ArrayList<Consulta> getConsultas() {
		ArrayList<Consulta> consultasLocal = new ArrayList<>();
		int posicion = 0;
		Consulta consulta = consultas.getByPosition(posicion);
		while (consulta != null) {
			consultasLocal.add(consulta);
			consulta = consultas.getByPosition(++posicion);
		}
		return consultasLocal;
	}
	
	Consulta get(int posicion) {
		return consultas.getByPosition(posicion);
	}

}
