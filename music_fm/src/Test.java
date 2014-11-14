import mydb.*;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
 
public class Test {
 
	public static SessionFactory sf;

	public static void main(String[] args){
    	try {
    		HibernateSessionFactory hf = null;
//			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = hf.getSession();
			session.beginTransaction();
/*
			Customer tmp = new Customer();
			tmp.setUserid(Integer.valueOf(1));
			tmp.setUsername("foolifish07");
			tmp.setUseremail("foolifish@gmail.com");
			tmp.setUserpassword("foolifish07");
			*/
			Music tmp  = new Music();
			tmp.setMusicid(Integer.valueOf(1));
			tmp.setMusicname("Now I see");
			
			session.save( tmp );
			session.getTransaction().commit();
			session.close();

        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}