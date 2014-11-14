package mydb;

/**
 * Album entity. @author MyEclipse Persistence Tools
 */

public class Album implements java.io.Serializable {

	// Fields

	private Integer albumid;
	private String albumname;
	private String albumimage;
	private String albumtime;
	private String albumdescription;

	// Constructors

	/** default constructor */
	public Album() {
	}

	/** minimal constructor */
	public Album(Integer albumid, String albumname, String albumimage,
			String albumtime) {
		this.albumid = albumid;
		this.albumname = albumname;
		this.albumimage = albumimage;
		this.albumtime = albumtime;
	}

	/** full constructor */
	public Album(Integer albumid, String albumname, String albumimage,
			String albumtime, String albumdescription) {
		this.albumid = albumid;
		this.albumname = albumname;
		this.albumimage = albumimage;
		this.albumtime = albumtime;
		this.albumdescription = albumdescription;
	}

	// Property accessors

	public Integer getAlbumid() {
		return this.albumid;
	}

	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}

	public String getAlbumname() {
		return this.albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public String getAlbumimage() {
		return this.albumimage;
	}

	public void setAlbumimage(String albumimage) {
		this.albumimage = albumimage;
	}

	public String getAlbumtime() {
		return this.albumtime;
	}

	public void setAlbumtime(String albumtime) {
		this.albumtime = albumtime;
	}

	public String getAlbumdescription() {
		return this.albumdescription;
	}

	public void setAlbumdescription(String albumdescription) {
		this.albumdescription = albumdescription;
	}

}