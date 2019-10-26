package _04_hospital;

public class Patient {
	boolean fcf = false;
	boolean feelsCaredFor() {
		return fcf;
	}
	public void checkPulse() {
		fcf = true;
	}
}
