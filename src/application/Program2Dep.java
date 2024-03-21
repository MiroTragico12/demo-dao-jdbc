package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2Dep {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();
	
		System.out.println("===TEST 1 : department findById ====");
		Department procuraId = DepartmentDao.findById(3);
		System.out.println(procuraId);
		
		Department newDepartment = new Department (null, "Artista");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());										
		
		System.out.println("\n===TEST 2 : department update====");
		Department dp1 = DepartmentDao.findById(1);
		dp1.setName("Varejo");
		DepartmentDao.update(dp1);
		System.out.println("Update complete");
		
		System.out.println("\n===TEST 3: department delete====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		DepartmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("\n===TEST 3 : seller findAll====");
		List<Department> list = DepartmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		
	}
	}
}

