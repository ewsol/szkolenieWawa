package it.jsystems.finals;

public class Pies {

	private String rodzina = "psowate";
	private String imiê;
	
	
	public Pies( String imiê) {
		super();
		this.imiê = imiê;
	}

	@Override
	public String toString() {
		return this.getImiê() + "to zwierzê z rodziny " + this.getRodzina();
	}

	public String getImiê() {
		return imiê;
	}
	public void setImiê(String imiê) {
		this.imiê = imiê;
	}
	public String getRodzina() {
		return rodzina;
	}

	public void szczeka() {
		System.out.println("Hau Hau Hau");
	}
}
