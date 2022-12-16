package JEHM31;

import java.sql.*;
import java.util.Scanner;

public class Engineering_details {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JEHM31","root","root");
//	     Statement statement=connection.createStatement();
//	   statement.execute("create table Engg_details(usn integer primary key, name varchar(30) ,branch varchar(40) not null,clg_name varchar(40),CGPA double)");
//	     connection.close();
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			System.out.println("1.Add\n2.Update branch by taking USN\n3.Update CGPA by taking USN\n4.fetch the student by taking USN\n5.Delete the student by taking USN\n6.fetch all the student present in the table\n7.Delete all the student present inside the table\n8.exit");
		System.out.println("......Enter an option......");
	
		switch(scanner.nextInt()){
		case 1:
		{
			PreparedStatement preparedStatement= connection.prepareStatement("insert into Engg_details values(?,?,?,?,?)");
			System.out.println("enter the USN");
			preparedStatement.setInt(1, scanner.nextInt());
			System.out.println("enter the name of the student");
			preparedStatement.setString(2, scanner.next());
			System.out.println("enter the branch name");
			preparedStatement.setString(3, scanner.next());
			System.out.println("enter the collage name");
			preparedStatement.setString(4, scanner.next());
			System.out.println("enter the CGPA");
			preparedStatement.setDouble(5, scanner.nextDouble());//(5, scanner.nextInt());
			preparedStatement.executeUpdate();
			System.out.println("...added...");

		}
		break;
		case 2:{
			PreparedStatement preparedStatement=connection.prepareStatement("update Engg_details set branch=? where USN=?");
			
			System.out.println("enter the usn");
			preparedStatement.setInt(2, scanner.nextInt());
			System.out.println("enter the branch");
			preparedStatement.setString(1, scanner.next());
			preparedStatement.executeUpdate();
			System.out.println("....updated....");
		}
		break;
		}	
		
		}}
		
	}


