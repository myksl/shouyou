package dao;

import java.util.List;

import vo.SellOrder;


public interface SellOrderDao {
	public boolean doCreate(SellOrder sellOrder)throws Exception;
	public List<SellOrder> findByOwn(String s)throws Exception;
	public SellOrder findById(String s)throws Exception;
	public boolean delete(SellOrder sellOrder)throws Exception;
}
