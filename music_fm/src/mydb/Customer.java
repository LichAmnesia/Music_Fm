package mydb;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String userpassword;
	private String username;
	private String usersex;
	private String useremail;
	private Set messages;
	private Set listens;
	private Set songcollections;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer userid, String userpassword, String useremail) {
		this.userid = userid;
		this.userpassword = userpassword;
		this.useremail = useremail;
	}

	/** full constructor */
	public Customer(Integer userid, String userpassword, String username,
			String usersex, String useremail, Set messages, Set listens,
			Set songcollections) {
		this.userid = userid;
		this.userpassword = userpassword;
		this.username = username;
		this.usersex = usersex;
		this.useremail = useremail;
		this.messages = messages;
		this.listens = listens;
		this.songcollections = songcollections;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsersex() {
		return this.usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUseremail() {
		return this.useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getListens() {
		return this.listens;
	}

	public void setListens(Set listens) {
		this.listens = listens;
	}

	public Set getSongcollections() {
		return this.songcollections;
	}

	public void setSongcollections(Set songcollections) {
		this.songcollections = songcollections;
	}

}