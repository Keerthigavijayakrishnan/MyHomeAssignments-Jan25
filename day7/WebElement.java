package week2.day3;

//Inheritance Classes- WebElement, Button, TextField, CheckBoxButton, RadioButton, Elements
//Base Class
public class WebElement {
	public void click() {
		System.out.println("Click");
	}
	public String setText(String text) {
		//System.out.println(text);
		return text;
	}
	
	public static void main(String[] args) {
		WebElement webelement=new WebElement();
		webelement.click();
		System.out.println(webelement.setText("Text from Base Class"));
	}

}
