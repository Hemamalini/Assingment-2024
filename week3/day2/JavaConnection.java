package week3.day2;

public class JavaConnection implements DatabaseConnection{

	
	public static void main(String[] args) {
		JavaConnection obj = new JavaConnection();
		obj.connect(101);
		obj.disconnect("Sucess");
		obj.executeUpdate(true);
	}

	public int connect(int port) {
		System.out.println(port);
		return 0;
	}

	public String disconnect(String staus) {
		System.out.println(staus);
		return null;
	}

	public boolean executeUpdate(boolean status) {
		System.out.println(status);
		return false;
	}

}
