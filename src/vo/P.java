package vo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import database.HibernateUtil;

public class P {
	private String admin;
	//private List<Product> list;
	
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	

	/*public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	*/

	public void a(){
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		P p= new P();
		p.setAdmin("lalalallal");
		/*Product pro = new Product();
		pro.setProductName("2");
		pro.setGame("11");
		pro.setInformation("11");
		pro.setLevel(1);
		pro.setPrice(11);
		List<Product> name = new ArrayList<Product>();
		name.add(pro);
		p.setList(name);
		*/
 		sess.save(p);
		tx.commit();
		sess.close();
		sf.close();
	}
	public void b(){
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		P p = null; 
		p = sess.get(P.class, new String("admin"));
		System.out.println(p.getAdmin());
		sess.save(p);
		tx.commit();
		sess.close();
		sf.close();
	}
	public void c(){
		Session sess = HibernateUtil. currentSession();
		Transaction tx = sess.beginTransaction();
		List p1 = sess.createQuery("select  p from P as p ")
				.list();
		tx.commit();
		for(Iterator i = p1.iterator();i.hasNext();){
			P p = (P)i.next();
			System.out.println(p.getAdmin());
		}
	}
	public static void main(String[] args) {
		P p = new P();
		p.c();
	}
}
