package it.jsystems.serializacja;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pracownik implements Serializable {
	
	private transient int nazwiskoRodowe;// transient znaczy, ¿e wartoœæ pola nie bêdzie podlega³a serializacji
	private String nazwisko;

	private static final long serialVersionUID = 1L;
	
	private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
		stream.defaultReadObject();
		nazwiskoRodowe = stream.readInt();
	}
	private void writeObject(ObjectOutputStream stream) throws ClassNotFoundException, IOException {
		stream.defaultWriteObject();
		stream.writeInt(nazwiskoRodowe + 1000);
	}
}
