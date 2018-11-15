package it.jsystems.serializacja;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pies extends Zwierze implements Serializable{

	private String imie;
	
	public Pies(String imie) {
		super();
		this.imie = imie;
	}
	private static final long serialVersionUID = 10L;
	
	private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
		stream.defaultReadObject();
		imie = (String) stream.readObject();
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.defaultWriteObject();
		stream.writeObject(imie);
	}
}
