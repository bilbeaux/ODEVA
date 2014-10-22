package donnees;

import java.util.Date;

public class Consultation {
	private Date date;
	private String corps;
	private MedecinSpecialiste medecin;
	
	/**
	 * @param date
	 * @param corps
	 * @param medecin
	 */
	public Consultation(Date date, String corps, MedecinSpecialiste medecin) {
		this.date = date;
		this.corps = corps;
		this.medecin = medecin;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the corps
	 */
	public String getCorps() {
		return corps;
	}

	/**
	 * @param corps the corps to set
	 */
	public void setCorps(String corps) {
		this.corps = corps;
	}

	/**
	 * @return the medecin
	 */
	public MedecinSpecialiste getMedecin() {
		return medecin;
	}

	/**
	 * @param medecin the medecin to set
	 */
	public void setMedecin(MedecinSpecialiste medecin) {
		this.medecin = medecin;
	}

	
}
