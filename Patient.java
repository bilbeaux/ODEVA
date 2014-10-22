package donnees;

public class Patient {
	private int numeroSecu;
	private String nom;
	private String adresse;
	private int age;
	
	
	/**
	 * @param numeroSecu
	 * @param nom
	 * @param adresse
	 * @param age
	 */
	public Patient(int numeroSecu, String nom, String adresse, int age) {
		this.numeroSecu = numeroSecu;
		this.nom = nom;
		this.adresse = adresse;
		this.age = age;
	}


	/**
	 * @return the numeroSecu
	 */
	public int getNumeroSecu() {
		return numeroSecu;
	}


	/**
	 * @param numeroSecu the numeroSecu to set
	 */
	public void setNumeroSecu(int numeroSecu) {
		this.numeroSecu = numeroSecu;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
