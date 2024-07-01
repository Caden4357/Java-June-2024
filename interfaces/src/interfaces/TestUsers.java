package interfaces;

import java.util.ArrayList;

public class TestUsers {
	public static void main(String[] args) {
		Customer caden = new Customer(1234);
		Admin jacob = new Admin();
		
		System.out.println(caden.accessAuthorized(12345));
		jacob.addIssue("Server is down in NW region");
		jacob.addIssue("DB breach");
		System.out.println(jacob.reportIssues());
		
		ArrayList<String> exampleIssues = new ArrayList<String>();
		exampleIssues.add("Server is down in NW region");
		exampleIssues.add("DB breach");
		jacob.qaTest(exampleIssues);
	}
}
