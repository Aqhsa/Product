package com.lulu11.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {
	  

			void createData()  throws SQLException {
	      Connection connection = ConnectionDB.setupConnection();
		String query ="INSERT INTO Products ( id, name, cost, description ) VALUES( ?, ?,?,?)";
			PreparedStatement myStmt = connection.prepareStatement(query);
			myStmt.setInt(1, 286);
			myStmt.setString(2, "bottle");
			myStmt.setInt(3, 2500);
			myStmt.setString(4, "new");

			int success = myStmt.executeUpdate();
			System.out.println("Added Successfully " + success);
	    	}
			
		void readData() throws SQLException {
			Connection connection=ConnectionDB.setupConnection();
			
			 Statement statement;
			 statement = connection.createStatement();
	         ResultSet resultSet;
	         resultSet = statement.executeQuery(
	             "select * from Products where id>=211");
	         int id;
	         String name;
	         int cost;
	         String description;
	         while (resultSet.next()) {
	             id = resultSet.getInt("id");
	             name = resultSet.getString("name");
	             cost=resultSet.getInt("cost");
	             description=resultSet.getString("description");
	             System.out.println("id : " + id
	                                + " name : " + name + " cost : " +cost+ "  description : "+ description);
	         }
	         
	         
			

		}
		
		void updateData() throws SQLException {

    		Connection connection = ConnectionDB.setupConnection();

    		String query = "update  products set name =? where id=?";

    		PreparedStatement myStmt = connection.prepareStatement(query);

    		myStmt.setString(1,"jacket");

    		myStmt.setInt(2,232);

    		boolean success = myStmt.execute();

    		System.out.println("Updated Successfully " + success);

    	}
		void deletData() throws SQLException {
			Connection connection = ConnectionDB.setupConnection();
			String query = "delete from Products where id = ? ";
			PreparedStatement myStmt = connection.prepareStatement(query);
			myStmt.setInt(1, 232);
			boolean success = myStmt.execute();
			System.out.println("Deleted Successfully " + success);

	 

		}
	}
