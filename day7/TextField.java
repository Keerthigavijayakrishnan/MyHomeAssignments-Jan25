package week2.day3;

//sub class -WebElement 2
public class TextField extends WebElement {
	public String getText(String text) {
		System.out.println("Get the Text from Webelement");
		return text;
	}
	
	public static void main(String[] args) {
		TextField textfield = new TextField();
		textfield.getText(null);
		textfield.click();
		System.out.println(textfield.setText("Text from sub class: TextField"));
	}

}
