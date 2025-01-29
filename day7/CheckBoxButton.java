package week2.day3;

//Sub class -WebElement 3
public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("Button Selected");
	}
	public static void main(String[] args) {
		CheckBoxButton checkboxbutton = new CheckBoxButton();
		checkboxbutton.clickCheckButton();
		checkboxbutton.submit();
		checkboxbutton.click();
		System.out.println(checkboxbutton.setText("Text from sub class: CheckBoxButton"));
	}

}
