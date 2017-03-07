package factory;


import dao.UserProxy;

public class UserFactory {
	private UserFactory() {
	}
	private static UserProxy proxy = null;
	public static UserProxy get() throws Exception{
		if(proxy==null){
			proxy = new UserProxy();
		}
		return new UserProxy();
	}
}