package mapper;

import pojo.User;

public interface RegistAndLogin {
public Integer findRegistName(String username);
public void regist(User user);
public String checkPassword(String username);
public String findNameByUid(Integer uid);
}
