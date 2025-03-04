package model.application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("\n=== TEST 1: department insert ===");
//        Department newDepartment = new Department(null, "TI");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());


        System.out.println("\n=== TEST 2: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);


        System.out.println("\n=== TEST 3: department update ===");
        department = departmentDao.findById(8);
        department.setName("Agro");
        departmentDao.update(department);
        System.out.println("Update Completed!");

//        System.out.println("\n=== TEST 4: department delete ===");
//        System.out.print("Enter id for delete test: ");
//        int id = sc.nextInt();
//        departmentDao.deleteById(id);
//        System.out.println("Delete completed! ");

        System.out.println("\n=== TEST 5: seller findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department department1 : list) {
            System.out.println(department1);
        }

        System.out.println("\n=== TEST 6: seller findAll ===");
        Department department1 = new Department(10, null);
        list = departmentDao.findByDepartment(department1);
        for (Department department2 : list) {
            System.out.println(department2);
        }

        sc.close();
    }
}
