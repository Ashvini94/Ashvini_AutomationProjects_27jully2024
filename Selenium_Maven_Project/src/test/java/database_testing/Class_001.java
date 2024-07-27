package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class_001 {
	

	public static void main(String[] args) throws SQLException {
		
		//local variable
		String host="localhost";
		String portno="3306";
		
		//create jdbc connection
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://"+host+":"+portno+"/automation","root","MySQL@1234");
		
		//to go upto the table of database
		Statement s = connection.createStatement();
		
		// to execute query
		ResultSet r = s.executeQuery("select * from student where name = \"Rama\"");
		
		//jump from 0 to 1
		r.next();
		
		System.out.println(r.getString("Name"));
		System.out.println(r.getNString("location"));
		System.out.println(r.getInt("mobileno"));
		
	}

}
