package dao;

import java.util.List;

import vo.Product;

public interface ProductDao {
	public boolean add(Product product)throws Exception;
	public List<Product> findByOwn(String ss)throws Exception;
	public boolean update(Product product)throws Exception;
	public boolean delete(Product product)throws Exception;
	public Product findById(String s)throws Exception;
	public List<Product> findAll()throws Exception;
}
