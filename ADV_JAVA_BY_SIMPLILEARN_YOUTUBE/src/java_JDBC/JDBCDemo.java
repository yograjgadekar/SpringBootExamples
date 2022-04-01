package java_JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		
		
		//variables
		final String url = "jdbc:mysql:///customer" ;
		final String user = "root";
		final String password = "root";
		
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		//establish the connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//Create JDBC status object 
		Statement st = con.createStatement();
		
		//prepare the query
		String query = "SELECT * FROM cust_info";
		
		//send the execute SQL query in DB software
		ResultSet rs = st.executeQuery(query);
		
		//Process the ResultSet object 
		boolean flag = false;
		
		while(rs.next())
		{
			flag = true;
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)+ " " + rs.getInt(5));
			
		}
		if(flag == true)
		{
			System.out.println("\nRecord Retrived & Displayed Successfully. ");
		}
		else
		{
			System.out.println("Record Not Found");
		}
		
		//Close JDBC Object 
		rs.close();
		st.close();
		con.close();
	}
}