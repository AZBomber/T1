package administrator.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import administrator.service.AdminCategroyService;
import pojo.Categroy;

@Controller
public class AdminCategroy {
	@Autowired
	AdminCategroyService adminCategroyService;
@RequestMapping("/adminCategroy")
public String adminCategroy(Model model){
	List<Categroy> AllCategroy=adminCategroyService.findAllCategroy();
	model.addAttribute("AllCategroy", AllCategroy);
	return "categroy/list";
}
@RequestMapping("/addCategroy")
public String addCategroy(){
	return "categroy/add";
}
@RequestMapping("/deleteCategroy")
public String deleteCategroy(Integer cid){
	adminCategroyService.deleteCategroy(cid);
	return "redirect:/adminCategroy";
}
@RequestMapping("/editCategroy")
public String editCategroy(int cid,Model model){
	model.addAttribute("cid", cid);
	return "categroy/edit";
}
@RequestMapping("/editingCategroy")
public String editingCategroy(Categroy categroy){
	adminCategroyService.editCategroy(categroy);
	return "redirect:/adminCategroy";
}
@RequestMapping("/addingCategroy")
public String addingCategroy(Categroy categroy){
	adminCategroyService.addCategroy(categroy);
	return "redirect:/adminCategroy";
}
}
