package com.training.bean;

public class LoginBean {
	private String loginName;
	private String fullName;
	private String Email;
	private String Address;
	private String postalCode;
	private String city;

	private String phone;
	private String mobilePhone;
	private String fax;
	private String url;
	private String password;
	private String confirmPassword;









	public LoginBean() {
	}

	public LoginBean(String loginName, String fullName,String Email,String Address,String postalCode,String city,String phone,String mobilePhone,String fax,String url,String password,String confirmPassword) {
		super();
		this.loginName = loginName;
		this.fullName = fullName;
		this.Email = Email;
		this.Address = Address;
		this.postalCode = postalCode;
		this.city = city;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.fax = fax;
		this.url = url;
		this.password = password;
		this.confirmPassword = confirmPassword;

	}

	public String getloginName() {
		return loginName;
	}

	public void setloginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getfullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getpostalCode() {
		return postalCode;
	}

	public void setpostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	
	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getmobilePhone() {
		return phone;
	}

	public void setmobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	public String getfax() {
		return fax;
	}

	public void setfax(String fax) {
		this.fax = fax;
	}
	
	public String geturl() {
		return url;
	}

	public void seturl(String url) {
		this.url = url;
	}
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getconfirmPassword() {
		return confirmPassword;
	}

	public void setconfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}












	@Override
	public String toString() {
		return "LoginBean [loginName=" + loginName + ", fullName=" + fullName + ",Email=" + Email + ",Address=" +Address+",postalCode="+postalCode+",city="+city+",phone="+phone+",mobilePhone="+mobilePhone+",fax="+fax+",url="+url+",password="+password+",confirmPassword="+confirmPassword+"]";
	}

}
