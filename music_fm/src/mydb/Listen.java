package mydb;

/**
 * Listen entity. @author MyEclipse Persistence Tools
 */

public class Listen implements java.io.Serializable {

	// Fields

	private Integer listenid;
	private Music music;
	private Customer customer;

	// Constructors

	/** default constructor */
	public Listen() {
	}

	/** minimal constructor */
	public Listen(Integer listenid) {
		this.listenid = listenid;
	}

	/** full constructor */
	public Listen(Integer listenid, Music music, Customer customer) {
		this.listenid = listenid;
		this.music = music;
		this.customer = customer;
	}

	// Property accessors

	public Integer getListenid() {
		return this.listenid;
	}

	public void setListenid(Integer listenid) {
		this.listenid = listenid;
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

}