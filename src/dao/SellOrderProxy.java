package dao;

import java.util.List;

import vo.BuyOrder;
import vo.SellOrder;

public class SellOrderProxy implements SellOrderDao{
	SellOrderHow sellOrderHow = new SellOrderHow();
	
	@Override
	public boolean doCreate(SellOrder sellOrder) throws Exception {
		boolean flag = false;
		try {
			flag = sellOrderHow.doCreate(sellOrder);
		} catch (Exception e) {
			
		}
		return flag;
	}
	@Override
	public boolean delete(SellOrder sellOrder) throws Exception {
		boolean flag = false;
		try {
			flag = sellOrderHow.delete(sellOrder);
		} catch (Exception e) {
			
		}
		return flag;
	}
	@Override
	public SellOrder findById(String s) throws Exception {
		SellOrder sellOrder =null;
		try{
			sellOrder = sellOrderHow.findById(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sellOrder!=null){
			return sellOrder;
		}else{
			return null;
		}
	}
	@Override
	public List<SellOrder> findByOwn(String s) throws Exception {
		List<SellOrder> list =null;
		try{
			list = sellOrderHow.findByOwn(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
