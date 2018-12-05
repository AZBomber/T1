package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategroyMapper;
import pojo.Categroy;
@Service
public class categroyService {
	@Autowired
CategroyMapper categroyMapper;
	public List<Categroy> findCategroy(){
		List<Categroy>categroy=categroyMapper.findCategroy();
		return categroy;
	}
}
