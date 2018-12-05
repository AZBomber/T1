package administrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import administrator.mapper.AdminProductMapper;
import pojo.Product;

@Service
public class AdminProductService {
@Autowired
 AdminProductMapper adminProductMapper;
public List<Product> AllProduct(){
	return adminProductMapper.adminfindAllProduct();
}
public void deleteProduct(Integer pid){
	adminProductMapper.deleteProduct(pid);
}
public void addProduct(Product product){
	adminProductMapper.addProduct(product);
}
public void editProduct(Product product){
	adminProductMapper.editProduct(product);
}
}
