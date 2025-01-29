package week2.day3;

//sub class -WebElement 1
public class Button extends WebElement {
	public void submit() {
		System.out.println("Button Submitted");
	}
	
	public static void main(String[] args) {
		Button button = new Button();
		button.submit();
		button.click();
		System.out.println(button.setText("Text from sub class: Button"));
	}

}
