package JEHM31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class M_details {
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag){
		switch(sc.nextInt())
	{
		case 1:{
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehm31","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into mockdetails values(?,?,?,?,?,?)");
	System.out.println("enter the Student id");
	preparedStatement.setInt(1, sc.nextInt());
	System.out.println("enter the student name");
	preparedStatement.setString(2, sc.next());
	System.out.println("enter the java mock_ratings");
	preparedStatement.setInt(3, sc.nextInt());
	System.out.println("enter the SQL mock_ratings");
	preparedStatement.setInt(4, sc.nextInt());
	System.out.println("enter the WEB ratings");
	preparedStatement.setInt(5, sc.nextInt());
	System.out.println("enter the no.of req...");
	preparedStatement.setInt(6, sc.nextInt());
	preparedStatement.executeUpdate();
	System.out.println("added...");
	connection.close();
}
		break;
		case 2:{
			
		}
		}
		}
}
}
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEHM31","root","root");
//Statement statement=connection.createStatement();
//	statement.execute
//("create table mockdetails(id integer primary key,S_name varchar(30),Java_M_ratings varchar(10),SQL_M_ratings varchar(10),WB_M_ratings varchar(10),No_of_req integer)");
//connection.close();