package listen;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.IOException;
import java.util.List;

import mydb.Customer;
import mydb.Listen;
import mydb.MySessionFactory;

import javax.servlet.jsp.JspWriter;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.Set;

public class listen {
	private String userName;
	public List<Listen> list;
	public Map<String,String> ma = new HashMap<String,String>();
	private Customer res;
	
	public Boolean find(){
		res = null;
		
		Session session = MySessionFactory.getSession();
		session.beginTransaction();
			
		org.hibernate.Criteria criteria = session.createCriteria(Customer.class);
	    criteria.add(Restrictions.eq("username",userName));
	    @SuppressWarnings("unchecked")
		List<Customer> lis = criteria.list();
		if ( !lis.isEmpty() )  res = lis.get(0); 
		
		
		if ( res==null ) {
			session.getTransaction().commit();
			session.close();
			return false;
		}else {
			Iterator it = res.getListens().iterator();
			while (it.hasNext()){
				Listen listit = (Listen)it.next();
				ma.put(listit.getMusic().getMusicname().toString(),listit.getMusic().getSingerid().toString());
			}
			session.getTransaction().commit();
			session.close();
			return true;
		}
	}
	
	public List<Listen> getListenlist(){
		return list;
	}
	
	
	public String solve(String userName){
		this.userName = userName;
		if (!find()) {
			String message="您还没有登录";
			return message;
		}else {
//			Iterator it = res.getListens().iterator();
//			
//			while (it.hasNext()){
//				Listen listit = (Listen)it.next();
//				ma.put(listit.getMusic().getMusicname().toString(),listit.getMusic().getSingerid().toString());
//			}
			return "hello";
		}
	}
}
