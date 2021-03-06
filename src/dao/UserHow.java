package dao;

import java.sql.Connection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import database.HibernateUtil;
import vo.User;


public class UserHow implements UserDao {

	
	@Override
	public boolean doCreate(User user) throws Exception{
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(user);
		tx.commit();
		HibernateUtil.closeSession();
		flag = true;
		return flag;
	}
	@Override
	public User findById(String s) throws Exception {
		User user = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx =sess.beginTransaction();
		user = sess.get(User.class, new String(s));
		tx.commit();
		HibernateUtil.closeSession();
		return user;
		
	}
	@Override
	public boolean check(User user) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx =sess.beginTransaction();
		User u = sess.get(User.class, new String(user.getName()));
		if(u.getPassword().equals(user.getPassword())){
			flag =true;
		}
		tx.commit();
		HibernateUtil.closeSession();
		return flag;
	}
	/*
	@Override
	public boolean check(User user) throws Exception {
		boolean flag = false;
		String sql = "select pass from user where name =?";
		prest = conn.prepareStatement(sql);
		prest.setString(1, user.getName());
		ResultSet rs = prest.executeQuery();
		while(rs.next()){
			if(user.getPass().equals(rs.getString(1))){
				flag = true;
			}

		}
		prest.close();
		return flag;
	}


	@Override
	public boolean delete(String s) throws Exception{
		boolean flag = false;
		String sql = "delete from user where name= ?";
		prest = conn.prepareStatement(sql);
		prest.setString(1, s);
		if(prest.executeUpdate()>0){
			flag = true;
		}
		prest.close();
		return flag;
	}
	@Override
	public List<User> findAll() throws Exception {
		User user = null;
		List<User> list = new ArrayList<User>();
		String sql = "select * from user ";
		prest = conn.prepareStatement(sql);
		ResultSet rs = prest.executeQuery();
		while(rs.next()){
			user = new User();
			user.setName(rs.getString(1));
			user.setPass(rs.getString(2));
			user.setPhoneNumber(rs.getString(3));
			user.setAddress(rs.getString(4));
			user.setUsername(rs.getString(5));
			user.setResult(rs.getInt(6));
			list.add(user);
		}
		prest.close();
		return list;
	}
	@Override
	public boolean findById(String s) throws Exception {
		boolean flag = false;
		String sql = "select * from user where name =?";
		prest = conn.prepareStatement(sql);
		prest.setString(1, s);
		ResultSet rs = prest.executeQuery();
		while(rs.next()){
			flag = true;
		}
		prest.close();
		return flag;
		
	}


	@Override
	public boolean update(User user) throws Exception {
		boolean flag = false;
		String sql = "update user set pass=?,phoneNumber=?,address=?,username=? where"
				+ " name=?";
		prest = conn.prepareStatement(sql);
		prest.setString(1,user.getPass());
		prest.setString(2, user.getPhoneNumber());
		prest.setString(3, user.getAddress());
		prest.setString(4, user.getUsername());
		prest.setString(5, user.getName());
		if(prest.executeUpdate()>0){
			flag = true;
		}
		prest.close();
		return flag;
	}
	*/
}