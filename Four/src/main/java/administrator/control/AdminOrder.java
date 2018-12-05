package administrator.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import administrator.service.AdminOrderService;
import pojo.Order;

@Controller
public class AdminOrder {
	@Autowired
	AdminOrderService adminOrderService;
@RequestMapping("/adminOrder")
public String adminOrder(Model model){
	List<Order> AllOrder=adminOrderService.findAllOrder();
	model.addAttribute("AllOrder", AllOrder);
	return "order/list";
}
}
