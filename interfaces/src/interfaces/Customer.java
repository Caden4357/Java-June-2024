package interfaces;

public class Customer implements UserManagement{
	private int userId;

	public Customer(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

//	@Override
//	public boolean assignUserId(int userId) {
//		this.userId = userId;
//		return true;
//	}

	@Override
	public boolean accessAuthorized(Integer confirmUserId) {
		return this.userId == confirmUserId;
	}
	
	
}
