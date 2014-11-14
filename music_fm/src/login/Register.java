package login;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionSupport;

import mydb.*;

public class Register extends ActionSupport { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	private String name;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean find(){
		Customer res = null;
		
		Session session = MySessionFactory.getSession();
		session.beginTransaction();
			
		org.hibernate.Criteria criteria = session.createCriteria(Customer.class);
	    criteria.add(Restrictions.eq("useremail",email));
	    @SuppressWarnings("unchecked")
		List<Customer> list = criteria.list();
		if ( !list.isEmpty() )  res = list.get(0); 
		
		session.getTransaction().commit();
		session.close();
		if ( res==null ) return false;
		else return true;
	}

	//	org.apache.struts2.dispatcher.FilterDispatcher
	@Override
    public String execute(){
		
		if ( email==null ) return "input";
        if ( password==null ) return "input";
        if ( find() ) return "input";
        Session session = MySessionFactory.getSession();
		session.beginTransaction();
		Customer c = new Customer();
		c.setUseremail(email);
		c.setUserpassword(password);
		c.setUsername(name);
		session.save(c);
		session.getTransaction().commit();
		session.close();
        
		ServletActionContext.getContext().getSession().put("customer",c);
		return "success";
	}
} 
