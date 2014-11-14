package listen;

import java.io.IOException;
import java.util.List;

import mydb.Customer;
import mydb.Listen;
import mydb.MySessionFactory;

import javax.servlet.jsp.JspWriter;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class listen {
	private String userName;
	private Integer userId;
	public List<Listen> list;
	public String[] books = 

            new String[]{

            "Spring2.0宝典" ,

            "轻量级J2EE企业应用实战",

            "基于J2EE的Ajax宝典",

            "Struts,Spring,Hibernate整合开发"

         };

	public Boolean find(){
		Customer res = null;
		
		Session session = MySessionFactory.getSession();
		session.beginTransaction();
			
		org.hibernate.Criteria criteria = session.createCriteria(Customer.class);
	    criteria.add(Restrictions.eq("username",userName));
	    @SuppressWarnings("unchecked")
		List<Customer> lis = criteria.list();
		if ( !lis.isEmpty() )  res = lis.get(0); 
		userId = res.getUserid();
		session.getTransaction().commit();
		session.close();
		if ( res==null ) return false;
		else return true;
	}
	
	public List<Listen> getListenlist(){
		return list;
	}
	
	
	public String solve(String userName,JspWriter out) throws IOException{
		this.userName = userName;
		if (!find()) {
			String message="您还没有登录";
			return message;
		}else {
			
			String message = "hello";
//        	message += "<tr>\n"
//					+ "<td>1</td><td>Mark</td><td>Otto</td>\n"
//					+ "</tr>\n";
//        	message += "</tbody></table>";
//        	out.print(message);
			Listen res = null;
			Session session = MySessionFactory.getSession();
			session.beginTransaction();
				
			org.hibernate.Criteria criteria = session.createCriteria(Listen.class);
		    criteria.add(Restrictions.eq("userid",userId));
		    @SuppressWarnings("unchecked")
			List<Listen> lis = criteria.list();
		    this.list = lis;
			session.getTransaction().commit();
			session.close();
			
			
			return message;
		}
	}
}
