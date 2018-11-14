package it.jsystems.klonowanie;

public class Odcinek implements Cloneable{

	private Punkt start;
	private Punkt end;

	public Odcinek(Punkt start, Punkt end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public void setStart(Punkt start) {
		this.start = start;
	}

	public void setEnd(Punkt end) {
		this.end = end;
	}

	public Punkt getStart() {
		return start;
	}

	public Punkt getEnd() {
		return end;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Odcinek o = (Odcinek) super.clone();
		Punkt start = (Punkt) this.getStart().clone();
		Punkt end = (Punkt) this.getEnd().clone();
		o.setStart(start);
		o.setEnd(end);
		return o;
	}

	@Override
	public String toString() {
		return ("Start punkt: " + this.getStart().toString() + " End punkt: " +
				this.getEnd().toString());
	}

	
}
