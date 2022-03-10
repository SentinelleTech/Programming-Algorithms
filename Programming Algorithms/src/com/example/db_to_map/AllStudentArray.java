package com.example.db_to_map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class AllStudentArray {
	
	Connection con;
	String db_url = "jdbc:mysql://localhost:3306/test";
	String db_user = "root";
	String db_pass = "";
	Map<String, String> m;
	Statement st;
	ResultSet rs;
	String rowData[][] = new String[100][5];

	public AllStudentArray() {
		
		m = new HashMap<String, String>();		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			System.out.println("Connecting...");
			
			con = DriverManager.getConnection(db_url, db_user, db_pass);
		
			System.out.println("connected!");
			
			st = con.createStatement();
			
			String q = "select * from students;     ";
			
			rs = st.executeQuery(q);
			
			int counter = -1;
			
			while(rs.next()){
				
				counter++;
				
				rowData[counter][0] = rs.getString(1);
				rowData[counter][1] = rs.getString(2);
				rowData[counter][2] = rs.getString(3);
				rowData[counter][3] = rs.getString(4);
				rowData[counter][4] = rs.getString(5);
									
				
			}
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AllStudentArray();

	}

}
