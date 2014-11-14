package mydb;

import java.util.HashSet;
import java.util.Set;

/**
 * Music entity. @author MyEclipse Persistence Tools
 */

public class Music implements java.io.Serializable {

	// Fields

	private Integer musicid;
	private String musicname;
	private String musicurl;
	private String musicdescription;
	private Integer musicvote;
	private Integer singerid;
	private Integer albumid;
	private Set messages = new HashSet(0);
	private Set songcollections = new HashSet(0);
	private Set listens = new HashSet(0);

	// Constructors

	/** default constructor */
	public Music() {
	}

	/** minimal constructor */
	public Music(Integer musicid, String musicname) {
		this.musicid = musicid;
		this.musicname = musicname;
	}

	/** full constructor */
	public Music(Integer musicid, String musicname, String musicurl,
			String musicdescription, Integer musicvote, Integer singerid,
			Integer albumid, Set messages, Set songcollections, Set listens) {
		this.musicid = musicid;
		this.musicname = musicname;
		this.musicurl = musicurl;
		this.musicdescription = musicdescription;
		this.musicvote = musicvote;
		this.singerid = singerid;
		this.albumid = albumid;
		this.messages = messages;
		this.songcollections = songcollections;
		this.listens = listens;
	}

	// Property accessors

	public Integer getMusicid() {
		return this.musicid;
	}

	public void setMusicid(Integer musicid) {
		this.musicid = musicid;
	}

	public String getMusicname() {
		return this.musicname;
	}

	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}

	public String getMusicurl() {
		return this.musicurl;
	}

	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}

	public String getMusicdescription() {
		return this.musicdescription;
	}

	public void setMusicdescription(String musicdescription) {
		this.musicdescription = musicdescription;
	}

	public Integer getMusicvote() {
		return this.musicvote;
	}

	public void setMusicvote(Integer musicvote) {
		this.musicvote = musicvote;
	}

	public Integer getSingerid() {
		return this.singerid;
	}

	public void setSingerid(Integer singerid) {
		this.singerid = singerid;
	}

	public Integer getAlbumid() {
		return this.albumid;
	}

	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getSongcollections() {
		return this.songcollections;
	}

	public void setSongcollections(Set songcollections) {
		this.songcollections = songcollections;
	}

	public Set getListens() {
		return this.listens;
	}

	public void setListens(Set listens) {
		this.listens = listens;
	}

}