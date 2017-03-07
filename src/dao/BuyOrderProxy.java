package dao;

import java.util.List;

import vo.BuyOrder;
import vo.Product;

public class BuyOrderProxy implements BuyOrderDao{
	BuyOrderHow buyOrderHow = new  BuyOrderHow();
	@Override
	public boolean doCreate(BuyOrder buyOrder) throws Exception {
		boolean flag = false;
		try {
			flag = buyOrderHow.doCreate(buyOrder);
		} catch (Exception e) {
			
		}
		return flag;
		
	}
	@Override
	public boolean delete(BuyOrder buyOrder) throws Exception {
		boolean flag = false;
		try {
			flag = buyOrderHow.delete(buyOrder);
		} catch (Exception e) {
			
		}
		return flag;
	}
	@Override
	public BuyOrder findById(String s) throws Exception {
		BuyOrder buyOrder =null;
		try{
			buyOrder = buyOrderHow.findById(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(buyOrder!=null){
			return buyOrder;
		}else{
			return null;
		}
	}
	@Override
	public List<BuyOrder> findByOwn(String s) throws Exception {
		List<BuyOrder> list =null;
		try{
			list = buyOrderHow.findByOwn(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
