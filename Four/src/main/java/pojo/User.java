package pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
int uid;
String username;
String password;
@Size(max=10,min=1,message="{user.name.length}")
String name;
String email;
String phone;
@NotNull(message="{user.address.notNull}")
String address;
String state;
String code;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

}
