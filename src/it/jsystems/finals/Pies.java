package it.jsystems.finals;

public class Pies {

	private String rodzina = "psowate";
	private String imi�;
	
	
	public Pies( String imi�) {
		super();
		this.imi� = imi�;
	}

	@Override
	public String toString() {
		return this.getImi�() + "to zwierz� z rodziny " + this.getRodzina();
	}

	public String getImi�() {
		return imi�;
	}
	public void setImi�(String imi�) {
		this.imi� = imi�;
	}
	public String getRodzina() {
		return rodzina;
	}

	public void szczeka() {
		System.out.println("Hau Hau Hau");
	}
}
