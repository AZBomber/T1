package mapper;

import java.util.List;

import pojo.CategroyAndSecond;
import pojo.Product;

public interface CategroySecondMapper {
public List<CategroyAndSecond> findCategroySecondbycid();
public List<Product> findProductListByCid(int cid,int begin,int limit);
public int findcountbycid(int cid);
public int findcountbycsid(int csid);
public List<Product> findProductListBycsid(int csid,int begin,int limit);
}
