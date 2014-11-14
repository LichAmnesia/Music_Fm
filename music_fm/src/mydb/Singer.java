package mydb;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */

public class Singer implements java.io.Serializable {

	// Fields

	private Integer singerid;
	private String singername;
	private String singersex;
	private String singerimage;
	private String singerdescription;

	// Constructors

	/** default constructor */
	public Singer() {
	}

	/** minimal constructor */
	public Singer(Integer singerid, String singername) {
		this.singerid = singerid;
		this.singername = singername;
	}

	/** full constructor */
	public Singer(Integer singerid, String singername, String singersex,
			String singerimage, String singerdescription) {
		this.singerid = singerid;
		this.singername = singername;
		this.singersex = singersex;
		this.singerimage = singerimage;
		this.singerdescription = singerdescription;
	}

	// Property accessors

	public Integer getSingerid() {
		return this.singerid;
	}

	public void setSingerid(Integer singerid) {
		this.singerid = singerid;
	}

	public String getSingername() {
		return this.singername;
	}

	public void setSingername(String singername) {
		this.singername = singername;
	}

	public String getSingersex() {
		return this.singersex;
	}

	public void setSingersex(String singersex) {
		this.singersex = singersex;
	}

	public String getSingerimage() {
		return this.singerimage;
	}

	public void setSingerimage(String singerimage) {
		this.singerimage = singerimage;
	}

	public String getSingerdescription() {
		return this.singerdescription;
	}

	public void setSingerdescription(String singerdescription) {
		this.singerdescription = singerdescription;
	}

}