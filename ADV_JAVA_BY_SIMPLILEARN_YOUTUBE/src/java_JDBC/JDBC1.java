package java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

		public static void main(String[] args) throws SQLException {
			
			
			//variables
			final String url = "jdbc:postgresql://localhost/demo" ;
			final String user = "postgres";
			final String password = "root";
			
			Connection con = null;
			
			int rollno = 01;
			String name = "John";
			int age = 25;
			
			String sql = "insert into student(rollno, name, age)" +
						"values("+ rollno +", '"+ name +"', "+ age +" )"; 
			
			try {
				
			
			//establish the connection
			con = DriverManager.getConnection(url, user, password);
			
			//Create JDBC status object 
			Statement st = con.createStatement();
			
			int m = st.executeUpdate(sql);
			if(m == 1)
			{
				System.out.println("Inserted Successfully.." +sql);
			}
			else
			{
				System.out.println("Insertion Failed.");
			}
			}
			catch(Exception ex)
			{
			System.err.println(ex);
			}
			
			
			/*	
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
		*/
		}
}
