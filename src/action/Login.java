package action;

import vo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import factory.UserFactory;

public class Login extends ActionSupport{
	private String name;
	private String password;
	private String phone;
	private String qq;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String register(){
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
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		user.setQq(qq);
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
	public String login(){
		ActionContext context = ActionContext.getContext();
		boolean flag = false;
		User user = null;
		user= new User();
		user.setName(name);
		user.setPassword(password); 
		try {
			if(UserFactory.get().findById(name)==null){
				return "login";
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			flag = UserFactory.get().check(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(flag){
			context.getSession().put("User", user.getName());
			return "success";
		}
			return "login";
	}
	
}
