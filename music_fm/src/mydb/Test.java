package mydb;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;;
 
public class Test {
 
	public static void main(String[] args){
    	
			//HibernateSessionFactory hf = null;
			//hf.rebuildSessionFactory();
			//Session sf = hf.getSession();

			SessionFactory sf = new Configuration().configure().buildSessionFactory();
            
			Session session = sf.openSession();
			
			session.beginTransaction();
			
			Customer tmp = new Customer();
			tmp.setUserid(Integer.valueOf(5));
			tmp.setUsername("ss");
			tmp.setUseremail("xx");
			
			session.save( tmp ); 
			
			session.getTransaction().commit();
			session.close();
    }
}