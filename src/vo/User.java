package vo;

import java.util.List;


import com.opensymphony.xwork2.ActionContext;

import factory.UserFactory;

public class User {
	private String name;
	private String password;
	private String qq;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	/*public String register(){
		boolean flag = false;
		ActionContext context = ActionContext.getContext();
		User user = null;
		try {
			// flag = UserFactory.get().findByName(name);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if(flag){
			return "login";
		}
		user = new User();
		
		user.setName("name");
		user.setPassword("password");
		user.setPhone("phone");
		user.setQq("qq");
		try {
			flag = UserFactory.get().doCreate(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag){
			context.getSession().put("User", user.getName());
			return "success";
		}else{
			return "login";
		}
	}
	public static void main(String[] args) {
		User user = new User();
		user.register();
	}
	*/

}
