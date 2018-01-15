package s_principle.db;

public class DataBaseConnectionManager {
	
	private static DataBaseConnectionManager instance = new DataBaseConnectionManager();
	
	
	public static DataBaseConnectionManager getManagerInstance() {
		return instance;
	}
	
	public boolean connect() {
		System.out.println("connecting to db...");
		return true;
	}
	
	public boolean disConnect() {
		System.out.println("disconnecting to db...");
		return true;
	}
	
}
