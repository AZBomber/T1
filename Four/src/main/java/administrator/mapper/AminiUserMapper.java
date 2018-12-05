package administrator.mapper;

import java.util.List;

import pojo.User;

public interface AminiUserMapper {
public List<User> AllUser();
public void editUser(User user);
public void deleteUser(Integer uid);
}
