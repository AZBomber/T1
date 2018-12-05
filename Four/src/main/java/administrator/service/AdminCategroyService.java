package administrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import administrator.mapper.AdminCategroyMapper;
import pojo.Categroy;
import pojo.CategroySecond;

@Service
public class AdminCategroyService {
	@Autowired
AdminCategroyMapper adminCategroyMapper;
	public List<Categroy> findAllCategroy(){
		return adminCategroyMapper.findAllCategroy();
	}
	public void addCategroy(Categroy categroy){
		adminCategroyMapper.addCategroy(categroy);
	} 
	public void deleteCategroy(Integer cid){
		adminCategroyMapper.deleteCategroy(cid);
	}
	public void editCategroy(Categroy categroy){
		adminCategroyMapper.editCategroy(categroy);
	}
}
