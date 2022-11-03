package concreteProducts;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import abstractProduct.IRecuperadorUnitario;

public class RecuperadorUnitarioSerializado<T> implements IRecuperadorUnitario<T> {

	@Override
	public T recupera(String path) {
		File file = new File(path);	
		FileInputStream flujoR;
		ObjectInputStream adaptadorR;
		T obj=null;
		if (file.exists()) {
			try {
				flujoR = new FileInputStream(file);
				adaptadorR = new ObjectInputStream(flujoR);
				obj=(T) adaptadorR.readObject();
				adaptadorR.close();
				flujoR.close();
			} catch (Exception e) {
				return obj;
			}
		}
		return obj;
	}

}
