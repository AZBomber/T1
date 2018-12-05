package control;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pojo.Order;
import pojo.OrderItem;
import pojo.Product;
import service.OrderService;
import service.productService;

@Controller
public class CBuyAndOrder {
	List<Product> cartProduct = new ArrayList<Product>();
	@Autowired
	OrderService orderservice;
	@Autowired
	productService productService;

	@RequestMapping("/BuyAndOrder")
	public ModelAndView BuyAndOrder(@RequestParam(required = false) Integer pid, HttpSession session,
			@RequestParam(required = false) Integer count) {
		ModelAndView modelAndView = new ModelAndView();
		if (session.getAttribute("uid") == null) {
			modelAndView.setViewName("redirect:/gotologin");
			return modelAndView;
		}
		if (pid != null) {
			Product newAddCartproduct = productService.findProductDetail(pid);
			newAddCartproduct.setCount(count);
			cartProduct.add(newAddCartproduct);
			double sum = 0;
			for (Product product : cartProduct) {
				sum += product.getCount() * product.getShop_price();
			}
			session.setAttribute("sum", sum);
			/* modelAndView.addObject("productcart", cartProduct); */
			session.setAttribute("productcart", cartProduct);
			modelAndView.setViewName("cart");
			return modelAndView;
		}
		modelAndView.setViewName("cart");
		return modelAndView;
	}

	@RequestMapping("/delet")
	public ModelAndView delet(int pid) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("secceed");
		/*
		 * for(Product product:cartProduct){ if(product.getPid()==pid){
		 * cartProduct.remove(product); } }
		 */
		Iterator<Product> iterator = cartProduct.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getPid() == pid) {
				iterator.remove();
			}
		}
		modelAndView.setViewName("cart");
		return modelAndView;
	}

	@RequestMapping("/clearAll")
	public String clearAll(HttpSession session) {
		cartProduct.clear();
		session.removeAttribute("sum");
		return "cart";
	}

	@RequestMapping("submitorder")
	public ModelAndView submitorder(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Order order = new Order();
		order.setTotal((Double) session.getAttribute("sum"));
		order.setName((String) session.getAttribute("name"));
		order.setState(1);
		order.setUid((Integer) session.getAttribute("uid"));
		order.setOrdertime(new Date());
		orderservice.insertOrder(order);
		for (Product product : cartProduct) {
			OrderItem orderItem = new OrderItem();
			orderItem.setCount(product.getCount());
			orderItem.setOid(order.getOid());
			orderItem.setPid(product.getPid());
			orderItem.setSubtotal(product.getShop_price() * product.getCount());
			orderservice.insertOrderItem(orderItem);
		}
		modelAndView.addObject("oid", order.getOid());
		modelAndView.setViewName("order");
		return modelAndView;
	}

	@RequestMapping("/commitOrder")
	public String commitOrder(Order order, HttpSession session) {
		order.setState(2);
		orderservice.commitOrder(order);
		System.out.println(order.getName());
		System.out.println(order.getAddress());
		cartProduct.clear();
		session.removeAttribute("sum");
		return "secceed";
	}

	@RequestMapping("/MyOrder")
	public ModelAndView MyOrder(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		List<pojo.Order> myorder = orderservice.findMyOrder((Integer) session.getAttribute("uid"));
		modelAndView.addObject("myorder", myorder);
		modelAndView.setViewName("orderList");
		return modelAndView;
	}
}
