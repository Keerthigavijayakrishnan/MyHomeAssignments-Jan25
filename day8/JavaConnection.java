package week2.day4;

//Interface & Abstraction 2
public class JavaConnection extends MySqlConnection implements DatabaseConnection  {
	
	//Implements the unimplemented methods
	
	@Override
	public void connect() {
		System.out.println("Connected to the Database");
			}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the Database");
		}

	@Override
	public void executeUpdate() {
		System.out.println("Updated the Database");
		}

	@Override
	public void executeQuery2() {
		System.out.println("Query executed from Concrete class");
	}
	

	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.executeUpdate();
		java.disconnect();
		java.executeQuery1();
		java.executeQuery2();
		
	}


}
