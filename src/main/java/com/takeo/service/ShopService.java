package com.takeo.service;

import java.util.List;


import com.takeo.exception.RecordNotFoundException;
import com.takeo.model.Shop;

public interface ShopService {
	
	public List<Shop> getAllShops();
	
	public Shop addShop(Shop shop);
	
	public Shop saveorUpdateShop(Shop shop);
	
	public boolean deleteShop(Integer id);
	
	Shop getShopById(Integer id) throws RecordNotFoundException;
	

}
