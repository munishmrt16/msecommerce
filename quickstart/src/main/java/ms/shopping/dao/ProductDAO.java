package ms.shopping.dao;

import java.util.List;

import ms.shopping.model.*;
public interface ProductDAO {
	public List<ProductModel> getAll();
	public void insert(ProductModel  p);
	ProductModel get(int pid);
	void update(ProductModel p);
	void delete(int pid);
}


