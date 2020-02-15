package com.training.bean;

public class LoginBean {
	private String member_login;
	private String subject;
	private String body;
	public LoginBean() {
	}
	public LoginBean(String member_login, String subject, String body) {
		super();
		this.member_login = member_login;
		this.subject = subject;
		this.body = body;
	}
	public String getMember_login() {
		return member_login;
	}
	public void setMember_login(String member_login) {
		this.member_login = member_login;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "LoginBean [member_login=" + member_login + ", subject=" + subject + ", body=" + body + "]";
	}
	
}
