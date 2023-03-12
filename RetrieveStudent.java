package com.example.db_to_map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class RetrieveStudent {
	
				Connection con;
				String db_url = "jdbc:mysql://localhost:3306/test";
				String db_user = "root";
				String db_pass = "";
				Map<String, Students> m;
				Statement st;
				ResultSet rs;
				Students s;

	public RetrieveStudent() {
		
		m = new HashMap<String, Students>();		
		
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
			
				System.out.println("Connecting...");
				
				con = DriverManager.getConnection(db_url, db_user, db_pass);
			
				System.out.println("connected!");
				
				st = con.createStatement();
				
				String q = "select * from students;     ";
				
				rs = st.executeQuery(q);
				
				while(rs.next()){
					
					String admission = rs.getString(1);
					String jina1 = rs.getString(2);
					String jina2 = rs.getString(3);
					Integer miaka = rs.getInt(4);
					String nambari = rs.getString(5);
										
					s = new Students(admission, jina1, jina2, miaka, nambari);
					m.put(admission, s);
					
				}
			
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			for(Object obj : m.keySet()){
				
				Students student = m.get(obj);
				
				System.out.println(student.getAdm() + " " + student.getFirstName()+ " " + student.getLastName() + " " + student.getAge() + " " + student.getPhone());
			}		
		
	}
	public static void main(String[] args) {
		new RetrieveStudent();
	}
}