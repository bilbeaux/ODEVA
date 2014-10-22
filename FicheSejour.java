package donnees;

import java.util.List;

public class FicheSejour {

	private Patient patient;
	private List<Specialite> specialites;

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the specialites
	 */
	public List<Specialite> getSpecialites() {
		return specialites;
	}

	/**
	 * @param specialites
	 *            the specialites to set
	 */
	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public void addSpecialite(Specialite specialite) {
		specialites.add(specialite);
	}

	public void removeSpecialite(Specialite specialite) {
		specialites.remove(specialite);
	}

	/**
	 * @param patient
	 * @param specialites
	 */
	public FicheSejour(Patient patient, List<Specialite> specialites) {
		this.patient = patient;
		this.specialites = specialites;
	}

}
