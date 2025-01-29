package week2.day3;

//Inheritance- TestData, LoginTestData
//Super class
public class TestData {
	public void enterCredentials() {
		System.out.println("User Credentials: ");
		}
	public void navigateToHomePage() {
		System.out.println("Returned to Home Screen");
	}
	
	public static void main(String[] args) {
		TestData testdata = new TestData();
		testdata.enterCredentials();
		testdata.navigateToHomePage();
	}

}
