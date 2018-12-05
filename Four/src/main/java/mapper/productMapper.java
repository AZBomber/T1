package mapper;

import java.util.List;

import pojo.Product;

public interface productMapper {
public List<Product> findHotProduct();
public List<Product> findNewProduct();
public Product findProductDetail(int pid);
}
