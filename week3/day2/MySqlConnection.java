package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection2 {
	public void executeQuery() {
		System.out.println("executeQuery");
	}
	public abstract void exitQuery();

}
