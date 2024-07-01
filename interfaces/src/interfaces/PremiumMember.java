package interfaces;

public class PremiumMember extends Customer implements UserManagement{

	public PremiumMember(int userId) {
		super(userId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean accessAuthorized(Integer confirmUserId) {
		String userIdString = Integer.toString(confirmUserId);
		if(userIdString.length() < 8) {
			return false;			
		}else if(this.getUserId() == confirmUserId) {
			return true;
		}
		return false;
	}

	
}
