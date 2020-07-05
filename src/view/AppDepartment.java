package view;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class AppDepartment {

	public static void main(String[] args) {
		
		Department dep = new Department(null, "Cozinha");
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== TEST 1: Insert ====");
		depDao.insert(dep);
		System.out.println("Sucess, Id " + dep.getId());
		
		
	}

}