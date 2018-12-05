package control;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.istack.internal.logging.Logger;

import pojo.User;
import service.RegistAndLoginService;

@Controller
public class CRegistandLogin {
	@Autowired
	RegistAndLoginService registAndLoginService;
    @RequestMapping("/gotoregist")
    public String goToRegist(){
    	return "regist";
    }
    @RequestMapping("/gotologin")
    public String goToLogin(){
    	return "login";
    }
	@RequestMapping("/registing")
	public ModelAndView regist(@Validated User user,BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Integer uid = registAndLoginService.findRegistName(user.getUsername());
		if(bindingResult.hasErrors()){
			List<ObjectError> validationError=bindingResult.getAllErrors();
			for(ObjectError o:validationError)
			{
				System.out.println(o.getDefaultMessage());
			}
			modelAndView.addObject("validationError", validationError);
			modelAndView.setViewName("regist");
			return modelAndView;
		}
		else {
			if (uid!=null) {
				modelAndView.addObject("registerror", "用户名已存在");
				modelAndView.setViewName("regist");
				return modelAndView;
			} else{
				registAndLoginService.regist(user);
				modelAndView.addObject("registsucceed", "注册成功");
				modelAndView.setViewName("login");
				return modelAndView;
			}
		}
	}

	@RequestMapping("/logining")
	public ModelAndView login(String username,String password,HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Integer uid=registAndLoginService.findRegistName(username);
		if (uid!=null) {
			if(password.equals(registAndLoginService.checkPassword(username))){
				session.setAttribute("uid", uid);
				String name=registAndLoginService.findNameByUid(uid);
				session.setAttribute("name", name);
				modelAndView.setViewName("redirect:/index");
				return modelAndView;
				
			}
			modelAndView.addObject("loginerror", "密码错误");
			modelAndView.setViewName("login");
			return modelAndView;
			
		}
		else{
			modelAndView.addObject("loginerror", "请先去注册");
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}
	@RequestMapping("/exit")
	public String  exit(HttpSession session){
		session.removeAttribute("uid");
		session.removeAttribute("name");
		return "redirect:/index";
	}
	@RequestMapping("/ajax")
	public void ajaxvalidator(String username,HttpServletResponse response) throws Exception{
		System.out.println(username);
		Integer uid=registAndLoginService.findRegistName(username);
		response.setContentType("text/html;charset=UTF-8");
		if(uid==null){
			response.getWriter().println("用户名可以使用");
		}
		else {
			response.getWriter().println("用户名已经存在");
		}
	}
	@RequestMapping("/ajaxphone")
	public void ajaxphone(String phone,HttpServletResponse response) throws Exception{
		System.out.println(phone);
		String myphone=URLDecoder.decode(phone, "UTF-8");
		boolean b=myphone.matches("[0-9]+");
		response.setContentType("text/html;charset=UTF-8");
		if(!b){
			response.getWriter().println("请输入电话号码");
		}
		else {
			if(myphone.trim().length()!=11){
				response.getWriter().println("号码不可用");
			}
			else {
				response.getWriter().println("号码可用");
			}
		}
	}
	@RequestMapping("/ajaxaddress")
	public User ajaxaddress(User user){
		System.out.println("66666666666");
		System.out.println(user.getAddress());
		return user;
	}

}
