package factory;

import dao.BuyOrderProxy;
import dao.SellOrderProxy;

public class SellOrderFactory {
	private SellOrderFactory() {
	}
	private static SellOrderProxy proxy = null;
	public static SellOrderProxy get(){
		if(proxy==null){
			proxy = new SellOrderProxy();
		}
		return new SellOrderProxy();
	}
}
