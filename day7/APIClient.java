package week2.day3;

//Method Overloading
public class APIClient {
	//One input argument
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	//Three input arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint+ " "+requestBody+" "+requestStatus);
		 //Verify the request is successful
		 if(requestStatus) {
			 System.out.println("Request sent Successfully");
		 }else {
			 System.out.println("Request Failed");
		 }
	}
	public static void main(String[] args) {
		APIClient apiclient = new APIClient();
		apiclient.sendRequest("One Input Argument Method: "+"www.apiclient.com");
		apiclient.sendRequest("Three Input Argument Method: ");
	    apiclient.sendRequest("www.apiclient.com", "Body", true);
		
	}

}
