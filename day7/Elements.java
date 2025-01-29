package week2.day3;

//sub class -WebElement 5
public class Elements extends Button{
	public static void main(String[] args) {
		Elements elements = new Elements();
		elements.submit();
		elements.click();
		System.out.println(elements.setText("Text from execution class: Elements"));
	}

}
