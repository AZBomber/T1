package administrator.mapper;

import java.util.List;

import pojo.Categroy;

public interface AdminCategroyMapper {
public List<Categroy> findAllCategroy();
public void addCategroy(Categroy categroy);
public void deleteCategroy(Integer cid);
public void editCategroy(Categroy categroy);
}
