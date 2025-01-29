package week2.day3;

//Sub Class -WebElement 4
public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("Radio Button Selected");
	}
	public static void main(String[] args) {
		RadioButton radiobutton = new RadioButton();
		radiobutton.selectRadioButton();
		radiobutton.submit();
		radiobutton.click();
		System.out.println(radiobutton.setText("Text from sub class: RadioButton"));
	}

}
