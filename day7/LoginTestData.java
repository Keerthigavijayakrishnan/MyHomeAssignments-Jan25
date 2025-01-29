package week2.day3;

//Sub class -TestData 1
public class LoginTestData extends TestData {
	public String enterUsername(String a) {
		return a;
	}
	public String enterPassword(String a) {
		return a;
	}
	public static void main(String[] args) {
		LoginTestData logintestdata = new LoginTestData();
		logintestdata.enterCredentials();
		System.out.println(logintestdata.enterUsername("username"));
		System.out.println(logintestdata.enterPassword("Password"));
		logintestdata.navigateToHomePage();
	}

}
