package dao;

import java.util.List;

import vo.Chat;

public interface ChatDao {
	public boolean add(Chat chat)throws Exception;
	public Chat findByUser(String s)throws Exception;
	public boolean update(Chat chat)throws Exception;
	public boolean delete(String s)throws Exception;
	public List<Chat> findAll()throws Exception;
}	
