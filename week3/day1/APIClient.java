package week3.day1;

public class APIClient {
	public String sendRequest(String endpoint) {
		return endpoint;
		
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("request sent with mulptiple argument is : "+endpoint+" "+requestBody+" "+requestStatus);
	}
	public static void main(String[] args) {
		APIClient obj = new APIClient();
		obj.sendRequest("request Send");
		obj.sendRequest("request", "message given", true);
	}
}
