package fabriques;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import donnees.Patient;

public class PatientFactory {

		private static PatientFactory instance;
		private static Map<Integer,Patient> ttlesPatients= new HashMap<Integer,Patient>();
		
		private PatientFactory(){

		}
		
		public PatientFactory getInstance(){
			if (instance == null) {
				instance = new PatientFactory();
			};
			return instance;
		}
		
		public static  Patient creerPatient(int numSecu, String nom, String adresse, int age ){
			Patient p = new Patient(numSecu,nom,adresse,age);
			ttlesPatients.put(numSecu, p);
			return p;
		}
		
		public void supprimerPatient(Integer obj){
			ttlesPatients.remove(obj);
		}
		
		public Iterator<Patient> listePatient(){
			return ttlesPatients.values().iterator();
		}
		
		public static Patient recherchePatient(Integer obj){
			return ttlesPatients.get(obj);
			
		}	
		
}
