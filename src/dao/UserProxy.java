package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.User;

public class UserProxy implements UserDao{
	
	UserHow userHow = new UserHow();
	
	
	@Override
	public boolean doCreate(User user) {
		boolean flag = false;
			try {
				flag = userHow.doCreate(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return flag;
	}
	@Override
	public boolean check(User user )  {
		boolean flag = false;
			try {
				flag = userHow.check(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return flag;
	}
	
	@Override
	public User findById(String s) throws Exception {
		User user = null;
		try {
			user = userHow.findById(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		}
		return user;
	}
	/*
	

	@Override
	public boolean delete(String s) {
		boolean flag = false;
		try {
			flag = userHow.delete(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dataBase.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	@Override
	public List<User> findAll() throws Exception {
		List<User> list = new ArrayList<User>();
		try {
			list = userHow.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dataBase.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public boolean findById(String s) throws Exception {
		boolean flag= false;
		User user = null;
		try {
			flag = userHow.findById(s);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dataBase.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean update(User user) throws Exception {
		boolean flag = false;
		try {
			flag = userHow.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				dataBase.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	*/
}