package action;

import factory.ProductFactory;
import vo.Product;

public class Sell {
	private String sellString;
	private String productName;
	private String game;
	private int level;
	private int price;
	private String information;
	private String account;
	private String password;
	private String system;
	private String own;
	private int listIndex;
	private int remaining;
	
	public String getSellString() {
		return sellString;
	}
	public void setSellString(String sellString) {
		this.sellString = sellString;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public int getListIndex() {
		return listIndex;
	}
	public void setListIndex(int listIndex) {
		this.listIndex = listIndex;
	}
	public String getOwn() {
		return own;
	}
	public void setOwn(String own) {
		this.own = own;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String sell(){
		boolean flag = false;
		Product product = new Product();
		product.setSystem(system);
		product.setAccount(account);
		product.setGame(game);
		product.setInformation(information);
		product.setLevel(level);
		product.setPassword(password);
		product.setPrice(price);		
		product.setProductName(productName);
		product.setOwn(own);
		product.setRemaining(1);
		product.setSellNumber(0);
		try {
			flag = ProductFactory.get().add(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag){
			return "success";
		}
		return "sell";
	}
	public String update(){
		boolean flag = false;
		Product product = new Product();
		product.setSystem(system);
		product.setAccount(account);
		product.setGame(game);
		product.setInformation(information);
		product.setLevel(level);
		product.setPassword(password);
		product.setPrice(price);		
		product.setProductName(productName);
		product.setOwn(own);
		product.setListIndex(listIndex);
		try {
			flag = ProductFactory.get().update(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag){
			return "success";
		}
		return "sell";
	}
	public String delete(){
		boolean flag = false;
		Product product = new Product();
		product.setListIndex(listIndex);
		try {
			flag = ProductFactory.get().update(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag){
			return "success";
		}
		return "sell";
	}

}
