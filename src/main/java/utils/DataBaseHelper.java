package utils;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseHelper 
{
	// 

	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Employeeinfo","Apurva5", "Apurva@5");
	
		Statement statement = connection.createStatement();
		String sqlQuery="INSERT INTO Employee VALUES(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000);";
		//ResultSet result=statement.executeQuery(sqlQuery);
	 statement.execute(sqlQuery);
	 connection.close();
		
	
	}
	//jdbc:mysql://127.0.0.1:3306/?user=Apurva5
	
}
