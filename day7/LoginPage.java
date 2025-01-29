package week2.day3;

//Method Overriding
//Sub class -BasePage 1
public class LoginPage extends BasePage {
	@Override
	public void performCommonTask() {
		super.performCommonTask();
		System.out.println("Sub-Class: Perform Common Task");
	}

	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.performCommonTask();
	}

}
