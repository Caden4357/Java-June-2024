package interfaces;

public interface UserManagement {
	
	// method for assigning a new user id
//	abstract boolean assignUserId(int userId);
	
	// method to authorize access based op the userId
	abstract boolean accessAuthorized(Integer confirmUserId);
}
