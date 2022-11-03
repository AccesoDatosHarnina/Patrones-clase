package concreteProducts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import abstractProduct.IGrabador;
import base.MyObjectOutputStream;

public class GrabadorSerializado<T> implements IGrabador<T> {
	private boolean estado = false;

	@Override
	public boolean graba(String path, T dto, boolean add) {
		File file = new File(path);
		FileOutputStream flujoW;
		ObjectOutputStream adaptadorW;
		try {
			boolean existe = file.exists();
			flujoW = new FileOutputStream(file, add);
			if (add && existe) {
				adaptadorW = new MyObjectOutputStream(flujoW);
			} else {
				adaptadorW = new ObjectOutputStream(flujoW);
			}
			adaptadorW.writeObject(dto);
			adaptadorW.close();
			flujoW.close();
			estado = true;
		} catch (Exception e) {
			estado = false;
		}
		return estado;
	}

}
