package java006;

public class User {

	private static int userNumber = 0;
	
	public User(){
		userNumber++;
	}
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		
		System.out.println("user1 username:"+user1.userNumber);
		System.out.println("user2 username:"+user2.userNumber);
	}
}
