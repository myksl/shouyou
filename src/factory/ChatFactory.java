package factory;

import dao.ChatProxy;

public class ChatFactory {
	private ChatFactory() {
	}
	private static ChatProxy proxy = null;
	public static ChatProxy get(){
		if(proxy==null){
			proxy = new ChatProxy();
		}
		return new ChatProxy();
	}
}
