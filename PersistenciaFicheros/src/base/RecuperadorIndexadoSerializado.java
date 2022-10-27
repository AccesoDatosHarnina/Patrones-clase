package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RecuperadorIndexadoSerializado<T extends Indicable, K> implements IRecuperadorIndexado<T, K> {

	@Override
	public T recupera(String path, K k) {
		File file = new File(path);
		FileInputStream flujoR;
		ObjectInputStream adaptadorR;
		T obj = null;
		if (file.exists()) {
			try {
				flujoR = new FileInputStream(file);
				adaptadorR = new ObjectInputStream(flujoR);
				T t = (T) adaptadorR.readObject();
				while (t != null) {
					if (t.getKey() == k) {
						return t;
					}
					t = (T) adaptadorR.readObject();
				}
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}

	@Override
	public T recupera(String path, int posicion) {
		File file = new File(path);
		FileInputStream flujoR;
		ObjectInputStream adaptadorR;
		T obj = null;
		if (file.exists()) {
			try {
				flujoR = new FileInputStream(file);
				adaptadorR = new ObjectInputStream(flujoR);
				T t = (T) adaptadorR.readObject();
				int contador=0;
				while (t != null) {
					if(posicion==contador) {
						return t;
					}
					contador++;
					t = (T) adaptadorR.readObject();
				}
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}
}
