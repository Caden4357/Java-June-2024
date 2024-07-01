package interfaces;

import java.util.ArrayList;

public interface AdminManagement {
	// Method to report system issues
	abstract ArrayList<String> reportIssues();
	
	// Default method to print system issues
	public default void printIssues() {
		System.out.println(reportIssues());
	}
	
    // Default method to perform a QA test on the reported issues
	public default boolean qaTest(ArrayList<String> issues) {
		if(reportIssues().equals(issues)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		return reportIssues().equals(issues);
	}
}
