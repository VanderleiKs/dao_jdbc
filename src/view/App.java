package view;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println("=== TEST 1: FindById ===");
		System.out.println(seller);
	}

}
