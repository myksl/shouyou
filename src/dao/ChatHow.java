package dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import database.HibernateUtil;
import vo.Chat;

public class ChatHow implements ChatDao{

	@Override
	public boolean add(Chat chat) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(chat);
		tx.commit();
		HibernateUtil.closeSession();
		flag = true;
		return flag;
	}

	@Override
	public Chat findByUser(String s) throws Exception {
		Chat chat = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		chat  = (Chat)sess.get(Chat.class,new String(s));
		tx.commit();
		HibernateUtil.closeSession();
		return chat;
	}

	@Override
	public boolean update(Chat chat) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.update(chat);
		tx.commit();
		HibernateUtil.closeSession();
		flag = true;
		return flag;
	}

	@Override
	public boolean delete(String s) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		Chat chat  = (Chat)sess.get(Chat.class,new String(s));
		sess.delete(chat);
		tx.commit();
		HibernateUtil.closeSession();
		flag = true;
		return flag;
	}
	@Override
	public List<Chat> findAll() throws Exception {
		List<Chat> list = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		list = sess.createQuery("select chat from Chat as chat")
				.list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}

}
