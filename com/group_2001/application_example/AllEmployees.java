package com.group_2001.application_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class AllEmployees {
	
	Map<String, Employees> emp_map;
	String db_url = "jdbc:mysql://localhost:3306/classicmodels";
	String db_username = "root";
	String db_password = "";
	Connection con;
	Statement st;
	ResultSet rs;
	Employees emp;
	

	public AllEmployees() {
		
		emp_map = new HashMap<String, Employees>();

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(db_url, db_username, db_password);
			
			st = con.createStatement();
			
			String query = "select * from employees";
			
			rs = st.executeQuery(query);
			
			while(rs.next()){
				
				String no = rs.getString("employeeNumber");
				String ln = rs.getString("lastName");
				String fn = rs.getString("firstName");
				String baruaPepe = rs.getString("email");
				
				
				emp = new Employees(no, ln, fn, baruaPepe);
				
				emp_map.put(no, emp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("EmployeeNumber \t Last Name \t\t First Name \t Email");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		for(Object obj : emp_map.keySet()){
			
			//Object str = emp_map.get(obj);
			
			Employees employees = emp_map.get(obj);
		
			System.out.println(employees.getEmployeeNumber() + "\t\t" + employees.getLastName() + "\t\t" + employees.getFirstName() + "\t\t" + employees.getEmail());
			
		}
		
	}

	
	public static void main(String[] args) {
		new AllEmployees();

	}

}
