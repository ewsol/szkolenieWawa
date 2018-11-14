package it.jsystems.finals;

public class Piese³ {
	private final String rodzina = "psowate";
	private String imiê;

	public Piese³(String imiê) {
		super();
		this.imiê = imiê;
		System.out.println("jestem w konstruktorze");
	}

	@Override
	public String toString() {
		return this.getImiê() + " to zwierzê z rodziny " + this.getRodzina();
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
