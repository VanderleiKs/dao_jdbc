package view;

import java.util.Date;
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
		
		System.out.println("=== TEST 1: seller FindById ===");
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller FindByDepartment ===");
		for(Seller obj : seller2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller FindAll ===");
		seller2 = sellerDao.findAll();
		for(Seller obj : seller2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert ===");
		Seller newSeller = new Seller(null, "Otilha", "otilha@gamil.com", new Date(), 2800.00, new Department(4, null));
		sellerDao.insert(newSeller);
		System.out.println("Included with sucess!, id = " + newSeller.getId());
	}

}
