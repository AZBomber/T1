package control;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.CategroyAndSecond;
import pojo.Product;
import service.CategroyAndSecondService;
import service.productService;

@Controller
public class CProductDetail {
	@Autowired
	productService productService;
	@Autowired
	CategroyAndSecondService categroyAndSecondService;
  @RequestMapping("/productdetail")
  public ModelAndView findProductDetail(Integer pid){
	  ModelAndView modelAndView=new ModelAndView();
	  Product product=productService.findProductDetail(pid);
	  List<CategroyAndSecond> categroyAndSeconds=categroyAndSecondService.findCategroySecondbycid();
	  modelAndView.addObject("categroyAndSeconds", categroyAndSeconds);
	  modelAndView.addObject("productdetail", product);
	  modelAndView.setViewName("product");
	  return modelAndView;
  }
}
