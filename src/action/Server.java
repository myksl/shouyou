package action;

import org.apache.struts2.ServletActionContext;

import vo.Chat;

import com.opensymphony.xwork2.ActionContext;

import factory.ChatFactory;

public class Server {
	private String content1;
	private String username;
	
	
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMessages(){
		ActionContext con = ActionContext.getContext();
		boolean flag = false;
        Chat chat =null;
		try {
			chat = ChatFactory.get().findByUser(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
        if(chat==null){
        	chat = new Chat();
        	chat.setUser(username);
        	chat.setText("");
        	con.getSession().put("username", username);
        	try {
				flag = ChatFactory.get().add(chat);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	if(flag){
        		return "success";
        	}
        }else{
        
        	String  text=  chat.getText();
        	ServletActionContext.getRequest().setAttribute("message", text);
        }
        return "success";
	}
	
	

	
	public String sendMessages(){
		boolean flag = false;
        Chat chat =null;
		try {
			chat = ChatFactory.get().findByUser(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
         String text = chat.getText();
         text += "<font color='red'>（用户）"+username+"</font>说："+content1 +"<br>";
         
         chat.setText(text);
         try {
			flag = ChatFactory.get().update(chat);
		} catch (Exception e) {
			e.printStackTrace();
		}
         if(flag){
        	 return "success";
         }
         return "success";
	}
	public String leave(){
		boolean flag = false;
		 try {
				flag = ChatFactory.get().delete(username);
			} catch (Exception e) {
				e.printStackTrace();
			}
	         if(flag){
	        	 return "success";
	         }
	         return "success";
		
	}
	
}
