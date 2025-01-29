package week2.day3;

//Inheritance- BasePage, LoginPage
//Super class
public class BasePage {
	public void findElement() {
		System.out.println("Find the Element");
	}
	public void clickElement() {
		System.out.println("Click the element");
	}
	public void performCommonTask() {
		System.out.println("Base Class: Perform Common Task");
	}
	
	public static void main(String[] args) {
		BasePage base = new BasePage();
		base.findElement();
		base.clickElement();
		base.performCommonTask();
	}

}
