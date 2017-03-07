package dao;

import java.util.List;

import vo.BuyOrder;

public interface BuyOrderDao {
	public boolean doCreate(BuyOrder buyOrder)throws Exception;
	public List<BuyOrder> findByOwn(String s)throws Exception;
	public BuyOrder findById(String s)throws Exception;
	public boolean delete(BuyOrder buyOrder)throws Exception;
}
