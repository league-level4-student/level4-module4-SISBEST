package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>(); 
	boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void assignPatient(Patient patient) throws DoctorFullException {
		if(patients.size() >= 3) {
			throw new DoctorFullException();
		}else {
			patients.add(patient);
		}
		
	}
	public void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).fcf = true;
		}
		
	}
}
