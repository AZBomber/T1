package administrator.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdministratorIndex {
	@RequestMapping("/admin")
	public String index(){
		return "home";
	}

}
