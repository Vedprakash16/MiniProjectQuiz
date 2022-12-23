package com.quiz.user;

public class User {
		private int userid;
		private String username;
		private String email;
		private String password;
		private String city;
		private long mobile;
		private int adminid;
		
		public String toString() {
			return"User [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
					+ ", city=" + city + ", mobile=" + mobile + ", adminid=" + adminid + "]";
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public int getAdminid() {
			return adminid;
		}
		public void setAdminid(int adminid) {
			this.adminid = adminid;
		}
	}

