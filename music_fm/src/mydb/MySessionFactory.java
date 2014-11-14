package mydb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Configures and provides access to Hibernate sessions, tied to the
 * current thread of execution.  Follows the Thread Local Session
 * pattern, see {@link http://hibernate.org/42.html }.
 */
@SuppressWarnings("deprecation")
public class MySessionFactory {
	private static SessionFactory sf = null;
	static {
		Configuration config = new Configuration(); 
		System.out.println("xxxxxx");
		config.configure();
		sf=config.buildSessionFactory();
	}
	public static Session getSession(){
		Session session=null;
		if(sf!=null){
		  session=sf.openSession();
		}
		return session;
	}
	public static void closeSession(Session session){
		if(session!=null&&session.isOpen()){
			session.close();
		}
	}
	public static Transaction  beginTransaction(Session session){
		Transaction tx=null;
		if(session!=null&&session.isOpen()){
			tx=session.beginTransaction();
		}
		return tx;
	}
	public static void  commitTransaction(Transaction tx){
         if(tx!=null&&!tx.wasCommitted()){
        	 tx.commit();
         }
	}
	
	public static void  rollbackTransaction(Transaction tx){
        if(tx!=null&&!tx.wasRolledBack()){
       	   tx.rollback();
        }
	}	
}