package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.productMapper;
import pojo.Product;

@Service
public class productService {
	@Autowired
	productMapper productmapper;
	public List<Product> findHotProduct(){
		List<Product> list=productmapper.findHotProduct();
		return list;
	}
	public List<Product> findNewProduct(){
		List<Product> list=productmapper.findNewProduct();
		return list;
	}
    public Product findProductDetail(int pid){
    	Product product=productmapper.findProductDetail(pid);
    	return product;
    }
}
