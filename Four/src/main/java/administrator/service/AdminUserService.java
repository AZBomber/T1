package administrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import administrator.mapper.AminiUserMapper;
import pojo.User;

@Service
public class AdminUserService {
@Autowired
AminiUserMapper aminiUserMapper;
public List<User> AllUser(){
	return aminiUserMapper.AllUser();
}
public void deleteUser(Integer uid)
{
	aminiUserMapper.deleteUser(uid);
	}
public void editUser(User user){
	aminiUserMapper.editUser(user);
}
}
