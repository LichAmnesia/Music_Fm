package login;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionSupport;

import mydb.*;

public class Enter extends ActionSupport { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private boolean isInvalid(String value)  {
        return (value == null);
    }
	
	public Customer judge(){
		Customer res = null;
		
		Session session = MySessionFactory.getSession();
		session.beginTransaction();
			
		org.hibernate.Criteria criteria = session.createCriteria(Customer.class);
	    criteria.add(Restrictions.eq("useremail",email));
	    criteria.add(Restrictions.eq("userpassword",password));
	    @SuppressWarnings("unchecked")
		List<Customer> list = criteria.list();
		if ( !list.isEmpty() )  res = list.get(0); 
			
		session.getTransaction().commit();
		session.close();
			
		return res;
	}

	//	org.apache.struts2.dispatcher.FilterDispatcher
	@Override
    public String execute(){
		
		if (isInvalid(getEmail())) return "input";
        if (isInvalid(getPassword())) return "input";
        
        Customer c = judge();
        if (c==null){
//        	System.out.println("fail");
        	return INPUT;
        }
		ServletActionContext.getContext().getSession().put("customer",c);
		return "success";
	}
} 
