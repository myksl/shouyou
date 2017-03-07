package dao;

import java.util.List;

import vo.Chat;

public class ChatProxy implements ChatDao{
	ChatHow chatHow = new ChatHow();

	@Override
	public boolean add(Chat chat) throws Exception {
		boolean flag = false;
		try {
			flag = chatHow.add(chat);
		} catch (Exception e) {
			
		}
		return flag;
	}

	@Override
	public Chat findByUser(String s) throws Exception {
		Chat chat = null;
		try{
			chat = chatHow.findByUser(s);
		}catch (Exception e){
			
		}
		return chat;
	}

	@Override
	public boolean update(Chat chat) throws Exception {
		boolean flag = false;
		try {
			flag = chatHow.update(chat);
		} catch (Exception e) {
			
		}
		return flag;
	}

	@Override
	public boolean delete(String s) throws Exception {
		boolean flag = false;
		try {
			flag = chatHow.delete(s);
		} catch (Exception e) {
			
		}
		return flag;
	}
	@Override
	public List<Chat> findAll() throws Exception {
		List<Chat> list =null;
		try{
			list = chatHow.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
