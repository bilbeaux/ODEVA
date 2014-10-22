package data;

public class FicheSuivi {

	private Specialiste specialiste;
	private Patient patient;
	private String compteRendu;
	
	public FicheSuivi() {
		
	}

	public Specialiste getSpecialiste() {
		return specialiste;
	}

	public void setSpecialiste(Specialiste specialiste) {
		this.specialiste = specialiste;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getCompteRendu() {
		return compteRendu;
	}

	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}

	
}
