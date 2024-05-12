package week3.day2;

public interface DatabaseConnection {
	public int connect( int port);
	public String disconnect(String staus);
	public boolean executeUpdate(boolean status);
	
	
}
