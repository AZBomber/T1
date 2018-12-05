package administrator.mapper;

import java.util.List;

import pojo.Product;

public interface AdminProductMapper {
	public List<Product> adminfindAllProduct();
	public void deleteProduct(Integer pid);
    public void addProduct(Product product);
    public void editProduct(Product product);
}
