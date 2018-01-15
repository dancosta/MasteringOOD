package o_principle;

public class EmergencyRoomProcess {

	public static void main(String[] args) {
		HospitalManagement ERDirector =  new HospitalManagement();
		
		Nurse nur1 = new Nurse(01, "Susan", "emergency", true);
		
		Doctor doc1 = new Doctor(01, "Allan", "emergency", true);
		
		ERDirector.callUpon(nur1);
		ERDirector.callUpon(doc1);
	}
}
