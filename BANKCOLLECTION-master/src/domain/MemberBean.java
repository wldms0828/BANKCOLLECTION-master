package domain;

public class MemberBean {
	protected String uid,password,name,
	ssn,address,phone,email,profile,regidate;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile=profile;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate=regidate;
	}

	@Override
	public String toString() {
		return "회원정보[아이디:" + uid +"\n" + ", 비밀번호:" + password +"\n"+ ", 이름:" + name + "\n" + ", 주민번호:" + ssn +"\n"+ ",주소:"
				+ address +"\n"+ ", 핸드폰번호:" + phone + "\n"+ ",Email:" + email + "]";
	}

}
