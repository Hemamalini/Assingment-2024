package week2.day2;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("performCommonTasks in LoginPage");
	}
	public static void main(String[] args) {
		LoginPage objLoginPage = new LoginPage();
		objLoginPage.performCommonTasks();
		objLoginPage.findElement();
		objLoginPage.clickElement();
		objLoginPage.enterText();
		BasePage objBasePage = new BasePage();
		objBasePage.performCommonTasks();
	}
}
