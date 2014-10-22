package data;

import java.util.ArrayList;
import java.util.List;

public class Specialite {

	private List<FicheSejour> listeFicheSejour;
	private String nom;
private int test;
	
	public Specialite(String nomSpe) {
		nom = nomSpe;
		listeFicheSejour = new ArrayList<FicheSejour>();
	}

	
	public String getNom() {
		return nom;
	}


	/*public void setNom(String nom) {
		this.nom = nom;
	}*/


	public List<FicheSejour> getListeFicheSejour() {
		return listeFicheSejour;
	}


	public void setListeFicheSejour(List<FicheSejour> listeFicheSejour) {
		this.listeFicheSejour = listeFicheSejour;
	}

	
	public void addFicheSejour(FicheSejour ficheS){
		listeFicheSejour.add(ficheS);
	}
	
	
	public void removeFicheSejour(FicheSejour ficheS){
		listeFicheSejour.remove(ficheS);
	}
}
