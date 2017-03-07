package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import database.HibernateUtil;
import vo.BuyOrder;

public class BuyOrderHow implements BuyOrderDao{
	@Override
	public boolean doCreate(BuyOrder buyOrder) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(buyOrder);
		tx.commit();
		HibernateUtil.closeSession();
		flag  = true;
		return flag;
	}
	@Override
	public boolean delete(BuyOrder buyOrder) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(buyOrder);
		tx.commit();
		flag = true;
		HibernateUtil.closeSession();
		return flag;
	}
	@Override
	public BuyOrder findById(String s) throws Exception {
		BuyOrder buyOrder = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		buyOrder = sess.get(BuyOrder.class, new Integer(s));
		tx.commit();
		HibernateUtil.closeSession();
		return buyOrder;
	}
	@Override
	public List<BuyOrder> findByOwn(String s) throws Exception {
		List<BuyOrder> list = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		list = sess.createQuery("select buyOrder from BuyOrder as buyOrder where own = :own")
				.setString("own", s).list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}
}
