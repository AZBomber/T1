package administrator.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import administrator.service.AdminUserService;
import pojo.User;

@Controller
public class AdminUser {
	@Autowired
	AdminUserService adminuserservice;
	@RequestMapping("/adminUser")
	public String adminUser(Model model){
		List<User> AllUser=adminuserservice.AllUser();
		model.addAttribute("AllUser", AllUser);
		return "user/list";
	}
	@RequestMapping("/deleteuser")
	public String deleteuser(Integer uid){
		adminuserservice.deleteUser(uid);
		return "redirect:/adminUser";
	}
	@RequestMapping("/edituser")
	public String edituser(Integer uid,Model model){
		model.addAttribute("uid", uid);
		return "user/edit";
	}
	@RequestMapping("/editinguser")
	public String editinguser(User user){
		adminuserservice.editUser(user);
		return "redirect:/adminUser";
	}
}
