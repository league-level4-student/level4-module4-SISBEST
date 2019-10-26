package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> employees = new ArrayList<Doctor>(); 
	ArrayList<Patient> patients = new ArrayList<Patient>(); 
	public void addDoctor(Doctor d) {
		employees.add(d);
	}
	public List<Doctor> getDoctors() {
		return employees;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void addPatient(Patient patient) {
		patients.add(patient);
		
	}
	public void assignPatientsToDoctors() {
		for (int i = 0; i < patients.size(); i++) {
			for(int j = 0; j < employees.size(); j++) {
				try {
					employees.get(j).assignPatient(patients.get(i));
					break;
				} catch (DoctorFullException e) {
				}
			}
		}
	}

}
