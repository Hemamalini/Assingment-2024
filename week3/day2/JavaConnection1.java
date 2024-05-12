package week3.day2;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		JavaConnection1 obj = new JavaConnection1();
		obj.connect();
		obj.disconnect();
		obj.executeQuery();
		obj.exitQuery();
		obj.executeUpdate();
	}

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

	@Override
	public void exitQuery() {
		System.out.println("exitQuery");
		
	}

}
