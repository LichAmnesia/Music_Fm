package login;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String execute(){
		ServletActionContext.getContext().getSession().remove("customer");
		return "success";
	}
} 
