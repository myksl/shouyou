package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import database.HibernateUtil;
import vo.BuyOrder;
import vo.SellOrder;

public class SellOrderHow implements SellOrderDao{
	@Override
	public boolean doCreate(SellOrder sellOrder) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(sellOrder);
		tx.commit();
		HibernateUtil.closeSession();
		flag  = true;
		return flag;
	}
	@Override
	public boolean delete(SellOrder sellOrder) throws Exception {
		boolean flag = false;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(sellOrder);
		tx.commit();
		flag = true;
		HibernateUtil.closeSession();
		return flag;
	}
	@Override
	public SellOrder findById(String s) throws Exception {
		SellOrder sellOrder = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		sellOrder = sess.get(SellOrder.class, new Integer(s));
		tx.commit();
		HibernateUtil.closeSession();
		return sellOrder;
	}
	@Override
	public List<SellOrder> findByOwn(String s) throws Exception {
		List<SellOrder> list = null;
		Session sess = HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		list = sess.createQuery("select sellOrder from SellOrder as sellOrder where own = :own")
				.setString("own", s).list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}
}
