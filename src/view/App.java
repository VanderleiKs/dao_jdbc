package view;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Deposit");
		
		Seller seller = new Seller(23, "Marcelo", "marcelo@gmail.com", new Date(), 3400.00, dep);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
