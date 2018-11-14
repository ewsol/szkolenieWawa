package it.jsystems.klonowanie;

public class Punkt implements Cloneable{
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int x;
	private int y;
	
	public Punkt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.valueOf(this.getX()) + String.valueOf(this.getY());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Punkt) {
			Punkt punkt = (Punkt) obj;
			return this.getX() == punkt.getX() && this.getY() == punkt.getY();
		}
		return false;

	}
}
