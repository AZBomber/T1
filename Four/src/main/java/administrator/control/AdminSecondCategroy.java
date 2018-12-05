package administrator.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import administrator.service.AdminCategroySecondSevice;
import administrator.service.AdminCategroyService;
import pojo.Categroy;
import pojo.CategroySecond;

@Controller
public class AdminSecondCategroy {
	@Autowired
	AdminCategroyService adminCategroyService;
	@Autowired
	AdminCategroySecondSevice adminCategroySecondSevice;
@RequestMapping("/adminSecondCategroy")
public String adminSecondCategroy(Model model){
	List<CategroySecond> AllCategroySecond=adminCategroySecondSevice.findAllCategroySeconds();
	model.addAttribute("AllCategroySecond", AllCategroySecond);
	return "categroysecond/list";
}
@RequestMapping("/edit")
public String edit(Model model,Integer csid){
	model.addAttribute("csid", csid);
	return "categroysecond/edit";
}
@RequestMapping("/editing")
public String editing(CategroySecond categroySecond){
	adminCategroySecondSevice.editone(categroySecond);
	return "redirect:/adminSecondCategroy";
}
@RequestMapping("/add")
public String add(Model model){
	List<Categroy> categroyscid=adminCategroyService.findAllCategroy();
	model.addAttribute("categroyscid", categroyscid);
	return "categroysecond/add";
}
@RequestMapping("/adding")
public String adding(CategroySecond categroySecond){
	adminCategroySecondSevice.addCategroySecond(categroySecond);
	return "redirect:/adminSecondCategroy";
}
@RequestMapping("/delete")
public String delete(Integer csid){
	adminCategroySecondSevice.deleteOne(csid);
	return "redirect:/adminSecondCategroy";
}
}
