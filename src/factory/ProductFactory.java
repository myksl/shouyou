package factory;

import dao.ProductProxy;


public class ProductFactory {
	private ProductFactory() {
	}
	private static ProductProxy proxy = null;
	public static ProductProxy get() throws Exception{
		if(proxy==null){
			proxy = new ProductProxy();
		}
		return new ProductProxy();
	}
}
