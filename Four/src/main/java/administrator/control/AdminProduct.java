package administrator.control;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import administrator.service.AdminCategroySecondSevice;
import administrator.service.AdminProductService;
import pojo.CategroySecond;
import pojo.Product;

@Controller
public class AdminProduct {
	@Autowired
	AdminCategroySecondSevice adminCategroySecondSevice;
	@Autowired
	AdminProductService adminProductService;

	@RequestMapping("/adminProduct")
	public String adminProduct(Model model) {
		List<Product> AllProduct=adminProductService.AllProduct();
		model.addAttribute("AllProduct", AllProduct);
		return "product/list";
	}

	@RequestMapping("/deleteproduct")
	public String deleteproduct(Integer pid) {
		adminProductService.deleteProduct(pid);
		return "redirect:/adminProduct";
	}

	@RequestMapping("/addproduct")
	public String addproduct(Model model) {
		List<CategroySecond> categroySeconds = adminCategroySecondSevice.findAllCategroySeconds();
		model.addAttribute("categroySeconds", categroySeconds);
		return "product/add";
	}

	@RequestMapping("/addingproduct")
	public String addingproduct(Product product,MultipartFile upload) throws Exception {
			String beginname=upload.getOriginalFilename();
			if(beginname!=null&&beginname.length()>0&&upload!=null){
				String path="E:\\pic\\";
				String newname=UUID.randomUUID()+beginname.substring(beginname.lastIndexOf("."));
				File file=new File(path+newname);
				upload.transferTo(file);
				product.setImage("products/"+newname);
			
			
		}
	
		product.setPdate(new java.sql.Date(System.currentTimeMillis()));
		System.out.println(product.toString());
		adminProductService.addProduct(product);
		return "redirect:/adminProduct";
	}

	@RequestMapping("/editproduct")
	public String editproduct(Integer pid, Model model) {
		List<CategroySecond> categroySeconds = adminCategroySecondSevice.findAllCategroySeconds();
		model.addAttribute("categroySeconds", categroySeconds);
		model.addAttribute("pid", pid);
		return "product/edit";
	}

	@RequestMapping("/editingproduct")
	public String editingproduct(Product product,MultipartFile multimage) throws Exception {
		String multimagebeginname=multimage.getOriginalFilename();
		if(multimagebeginname!=null&&multimagebeginname.length()>0&&multimage!=null){
			String path="E:\\pic\\";
			String newname=UUID.randomUUID()+multimagebeginname.substring(multimagebeginname.lastIndexOf("."));
			File file=new File(path+newname);
			multimage.transferTo(file);
			product.setImage("products/"+newname);
		
		
	}
		System.out.println(product.toString());
		adminProductService.editProduct(product);
		return "redirect:/adminProduct";
	}
}
