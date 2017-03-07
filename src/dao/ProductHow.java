package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import vo.Product;
import database.HibernateUtil;

public class ProductHow implements ProductDao{

	@Override
	public boolean add(Product product) {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx= sess.beginTransaction();
		sess.save(product);
		tx.commit();
		flag = true;  
		HibernateUtil.closeSession();
		return flag;
	}
	@Override
	public List<Product> findByOwn(String s) {
		List<Product> list =null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		list =sess.createQuery("select product from Product as product where own =:own")
				.setString("own", s).list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}
	@Override
	public boolean update(Product product) throws Exception {
		boolean flag =false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.update(product);
		tx.commit();
		HibernateUtil.closeSession();
		flag  = true;
		return flag;
	}
	@Override
	public boolean delete(Product product) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(product);
		tx.commit();
		HibernateUtil.closeSession();
		return flag;
	}
	@Override
	public Product findById(String s) throws Exception {
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		Product product =null;
		product = sess.get(Product.class, new Integer(s));
		tx.commit();
		HibernateUtil.closeSession();
		return product;

	}
	@Override
	public List<Product> findAll() throws Exception {
		List<Product> list =null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		list =sess.createQuery("select product from Product as product where own !=null")
				.list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}
	
}
