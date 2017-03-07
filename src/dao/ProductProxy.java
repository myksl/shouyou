package dao;

import java.util.List;

import vo.Product;

public class ProductProxy implements ProductDao{
	ProductHow productHow = new ProductHow();
	@Override
	public boolean add(Product product) {
		boolean flag = false;
		try{
			flag = productHow.add(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public List<Product> findByOwn(String s) {
		List<Product> list =null;
		try{
		list = productHow.findByOwn(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public boolean update(Product product) throws Exception {
		boolean flag = false;
		try{
			flag = productHow.update(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean delete(Product product) throws Exception {
		boolean flag = false;
		try{
			flag = productHow.delete(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public Product findById(String s) throws Exception {
		Product product =null;
		try{
			product = productHow.findById(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(product!=null){
			return product;
		}else{
			return null;
		}
	}
	@Override
	public List<Product> findAll() throws Exception {
		List<Product> list =null;
		try{
		list = productHow.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
