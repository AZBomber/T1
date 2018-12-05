package control;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;
import service.CategroyAndSecondService;
import utils.Page;

@Controller
public class CategroyAndSecond {
	@Autowired
	CategroyAndSecondService categroyAndSecondService;
@RequestMapping("/productlist")
public ModelAndView findProductlistbycid(int cid,int nowpage){
	ModelAndView modelAndView=new ModelAndView();
	Page<Product> page=new Page<Product>();
	page.setCid(cid);
	page.setLimit(4);
	page.setNowpage(nowpage);
	page.setBegin((page.nowpage-1)*page.limit);
	List<Product> productlist=categroyAndSecondService.findProductListByCid(cid,page.begin,page.limit);
	int total=categroyAndSecondService.findcountbycid(cid);
	page.setProduct(productlist);
    page.setTotalcount(total);
    int pagecount=0;
    if(page.getTotalcount()%page.getLimit()==0){
    	pagecount=page.getTotalcount()/page.getLimit();
    }
    else{
    	pagecount=page.getTotalcount()/page.getLimit()+1;
    }
    page.setPagecount(pagecount);
	List<pojo.CategroyAndSecond> categroyAndSeconds=categroyAndSecondService.findCategroySecondbycid();
	modelAndView.addObject("pagelist", productlist);
	modelAndView.addObject("categroyAndSeconds", categroyAndSeconds);
	modelAndView.addObject("page", page);
	modelAndView.setViewName("productList");
	return modelAndView;
}
@RequestMapping("/findbycsid")
public ModelAndView findByCsid(int csid,int nowpage){
	ModelAndView modelAndView=new ModelAndView();
	Page<Product> page=new Page<Product>();
	page.setLimit(2);
	page.setNowpage(nowpage);
	page.setCsid(csid);
	page.setBegin((page.nowpage-1)*page.limit);
	List<Product> productlist=categroyAndSecondService.findProductListBycsid(csid, page.getBegin(), page.getLimit());
	int total=categroyAndSecondService.findcountbycsid(csid);
	page.setTotalcount(total);
	 int pagecount=0;
	    if(page.getTotalcount()%page.getLimit()==0){
	    	pagecount=page.getTotalcount()/page.getLimit();
	    }
	    else{
	    	pagecount=page.getTotalcount()/page.getLimit()+1;
	    }
	    page.setPagecount(pagecount);
	    System.out.println(productlist.size());
	    System.out.println(page.getBegin());
	    System.out.println(page.getCid());
	    System.out.println(page.getLimit());
	    System.out.println(page.getNowpage());
	    System.out.println(page.getTotalcount());
	    System.out.println(page.getPagecount());
		List<pojo.CategroyAndSecond> categroyAndSeconds=categroyAndSecondService.findCategroySecondbycid();
		modelAndView.addObject("pagelist", productlist);
		modelAndView.addObject("categroyAndSeconds", categroyAndSeconds);
		modelAndView.addObject("page", page);
		modelAndView.setViewName("productList");
		return modelAndView;
}
}
