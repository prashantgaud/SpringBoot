package mobile.model;

public class MobileStatus {

	private int statusCode;
	private String message;
	private Mobile mobile;
	
	
	public int getStatuCode() {
		return statusCode;
	}
	public void setStatuCode(int statuCode) {
		this.statusCode = statuCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public MobileStatus(int statuCode, String message, Mobile mobile) {
		super();
		this.statusCode = statuCode;
		this.message = message;
		this.mobile = mobile;
	}
	public MobileStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
