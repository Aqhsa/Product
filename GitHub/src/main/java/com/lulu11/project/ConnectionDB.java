package com.lulu11.project;



import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	
		
			static Connection connection;
			
			public static Connection setupConnection() {
			
			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up
				 
		         connection = DriverManager.getConnection("datapath
		            "root", "");
			}
			catch(Exception E) {
				
			}
			
			
			return connection;

		}
		}
