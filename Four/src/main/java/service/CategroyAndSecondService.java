package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategroySecondMapper;
import pojo.CategroyAndSecond;
import pojo.Product;

@Service
public class CategroyAndSecondService {
	@Autowired
	CategroySecondMapper categroySecondMapper;

	public List<CategroyAndSecond> findCategroySecondbycid() {
		List<CategroyAndSecond> list = categroySecondMapper.findCategroySecondbycid();
		return list;
	}
	public List<Product> findProductListByCid(int cid,int begin,int limit){
		List<Product> list=categroySecondMapper.findProductListByCid(cid,begin,limit);
		return list;
	}
	public int findcountbycid(int cid){
		int count=categroySecondMapper.findcountbycid(cid);
		return count;
	}
	public int findcountbycsid(int csid){
		int count=categroySecondMapper.findcountbycsid(csid);
		return count;
	}
	public List<Product> findProductListBycsid(int csid,int begin,int limit){
		List<Product> list=categroySecondMapper.findProductListBycsid(csid, begin, limit);
		return list;
	}
}
