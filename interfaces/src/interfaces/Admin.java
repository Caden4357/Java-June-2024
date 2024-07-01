package interfaces;

import java.util.ArrayList;

public class Admin implements AdminManagement{
	private ArrayList<String> issues = new ArrayList<String>();

	public Admin() {
	}

	public ArrayList<String> getIssues() {
		return issues;
	}

	public void setIssues(ArrayList<String> issues) {
		this.issues = issues;
	}

	@Override
	public ArrayList<String> reportIssues() {
		// TODO Auto-generated method stub
		return issues;
	}
	
	public void addIssue(String issue) {
		issues.add(issue);
	}
	
	
	
}
