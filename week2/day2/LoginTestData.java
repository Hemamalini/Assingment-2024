package week2.day2;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("enterUsername");

	}
	public void enterPassword() {
		System.out.println("enterPassword");
	}
	public static void main(String[] args) {
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
	}
}
