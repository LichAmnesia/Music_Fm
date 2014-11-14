package mydb;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer messageid;
	private Music music;
	private Customer customer;
	private String messagetitle;
	private String messagecontent;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Integer messageid) {
		this.messageid = messageid;
	}

	/** full constructor */
	public Message(Integer messageid, Music music, Customer customer,
			String messagetitle, String messagecontent, Timestamp time) {
		this.messageid = messageid;
		this.music = music;
		this.customer = customer;
		this.messagetitle = messagetitle;
		this.messagecontent = messagecontent;
		this.time = time;
	}

	// Property accessors

	public Integer getMessageid() {
		return this.messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	public Music getMusic() {
		return this.music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getMessagetitle() {
		return this.messagetitle;
	}

	public void setMessagetitle(String messagetitle) {
		this.messagetitle = messagetitle;
	}

	public String getMessagecontent() {
		return this.messagecontent;
	}

	public void setMessagecontent(String messagecontent) {
		this.messagecontent = messagecontent;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}