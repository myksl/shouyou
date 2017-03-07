package factory;

import dao.BuyOrderProxy;

public class BuyOrderFactory {
	private BuyOrderFactory(){};
	private static BuyOrderProxy proxy = null;
	public static BuyOrderProxy get(){
		if(proxy==null){
			proxy = new BuyOrderProxy();
		}
		return proxy;
	}
}
