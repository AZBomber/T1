package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.RegistAndLogin;
import pojo.User;

@Service
public class RegistAndLoginService {
	@Autowired
	RegistAndLogin registAndLogin;
public Integer findRegistName(String username){
	Integer uid=registAndLogin.findRegistName(username);
	return uid;
} 
public void regist(User user){
	registAndLogin.regist(user);
}
public String checkPassword(String username){
	String password=registAndLogin.checkPassword(username);
	return password;
}
public String findNameByUid(Integer uid){
	String name= registAndLogin.findNameByUid(uid);
	return name;
}
}
