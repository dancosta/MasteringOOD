package d_principle.processes.clients;

import d_principle.processes.GeneralManufactoringProcess;
import d_principle.processes.SmartphoneManufactoringProcess;

public class DeviceFactory {
	
	public static void main(String[] args) {
		GeneralManufactoringProcess manufacturer = new SmartphoneManufactoringProcess("Iphone X");
		manufacturer.launchProcess();
	}

}
