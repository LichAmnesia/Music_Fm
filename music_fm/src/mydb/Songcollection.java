package mydb;

/**
 * Songcollection entity. @author MyEclipse Persistence Tools
 */

public class Songcollection implements java.io.Serializable {

	// Fields

	private Integer songcollectionid;
	private Music music;
	private Customer customer;

	// Constructors

	/** default constructor */
	public Songcollection() {
	}

	/** minimal constructor */
	public Songcollection(Integer songcollectionid) {
		this.songcollectionid = songcollectionid;
	}

	/** full constructor */
	public Songcollection(Integer songcollectionid, Music music,
			Customer customer) {
		this.songcollectionid = songcollectionid;
		this.music = music;
		this.customer = customer;
	}

	// Property accessors

	public Integer getSongcollectionid() {
		return this.songcollectionid;
	}

	public void setSongcollectionid(Integer songcollectionid) {
		this.songcollectionid = songcollectionid;
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