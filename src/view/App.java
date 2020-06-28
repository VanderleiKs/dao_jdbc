package view;

import model.entities.Department;

public class App {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Deposit");
		
		System.out.println(dep);
	}

}
