package control;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Categroy;
import pojo.Product;
import service.categroyService;
import service.productService;

@Controller
public class IndexC {
	@Autowired
	productService productService;
	@Autowired
	categroyService categroyService;
	@RequestMapping("/index")
	public ModelAndView method1(HttpSession session){
		ModelAndView modelAndView=new ModelAndView();
        List<Product> hotlist=productService.findHotProduct();
        List<Product> newproduct=productService.findNewProduct();
        List<Categroy>  headList=categroyService.findCategroy();
        session.setAttribute("categroy", headList);
        modelAndView.addObject("hotproduct", hotlist);
        modelAndView.addObject("newproduct", newproduct);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	@RequestMapping("/itemdetail")
	public ModelAndView method2(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("secceed");
		return modelAndView;
	}

}
