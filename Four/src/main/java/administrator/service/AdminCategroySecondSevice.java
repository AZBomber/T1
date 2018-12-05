package administrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import administrator.mapper.AdminCategroySecondMapper;
import pojo.CategroySecond;

@Service
public class AdminCategroySecondSevice {
@Autowired
 AdminCategroySecondMapper adminCategroySecondMapper;
public List<CategroySecond> findAllCategroySeconds(){
/*	List<CategroySecond> allList=adminCategroySecondMapper.findAllCategroySeconds();
	Page*/
	return adminCategroySecondMapper.findAllCategroySeconds();
}
public void deleteOne(Integer csid){
	adminCategroySecondMapper.deleteOne(csid);
}
public void editone(CategroySecond categroySecond){
	adminCategroySecondMapper.editone(categroySecond);
}
public void addCategroySecond(CategroySecond categroySecond){
	adminCategroySecondMapper.addCategroySecond(categroySecond);
}
}
