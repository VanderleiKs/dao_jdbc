package view;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		Seller seller = sellerDao.findById(3);
		
		List<Seller> seller2 = sellerDao.findByDepartment(new Department(1, null));
		
		System.out.println("=== TEST 1: FindById ===");
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: FindByDepartment ===");
		for(Seller obj : seller2) {
		System.out.println(obj);
		}
	}

}
