package Demo;

import java.sql.*;

import java.util.Scanner;

public class Sample {
private static Scanner connection;

public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag)
	{
		System.out.println("1.add...\n2.exit...");
	switch(sc.nextInt()){
	case 1:{
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEHM31","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into student_details values(?,?,?)");
	System.out.println(" enter the id");
	preparedStatement.setInt(1,sc.nextInt());
	System.out.println("enter the name");
	preparedStatement.setString(2, sc.next());
	System.out.println("enter the city");
	preparedStatement.setString(3, sc.next());
	preparedStatement.executeUpdate();
	System.out.println("added");
}break;
	case 2:{
		flag=false;
		System.out.println("thankyou");
	}break;
	default:
		System.out.println("invalid option");
		break;
}
	
}
	connection.close();
}
}
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//Statement statement=connection.createStatement();
//statement.execute("create database JEHM31");
//connection.close();
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEHM31","root","root");
//Statement statement=connection.createStatement();
//statement.execute("create table Student_details(id integer primary key,name varchar(40),city varchar(30))");
//connection.close();
//Class.forName("com.mysql.cj.jdbc.Driver");
//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEHM31","root","root");
//PreparedStatement p=connection.prepareStatement("insert into student_details values(?,?,?)");
//System.out.println("enter the id");
//p.setInt(1,sc.nextInt());
//System.out.println("enter the name");
//p.setString(2, sc.next());
//System.out.println("enter the city");
//p.setString(3,sc.next());
//p.executeUpdate();
//System.out.println("added");
//connection.close();
