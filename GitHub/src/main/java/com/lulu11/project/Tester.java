package com.lulu11.project;



import java.sql.SQLException;

import com.lulu11.project.BusinessLogic;


public class Tester {

	
		public static void main(String[] args) throws SQLException  {
		BusinessLogic bl= new BusinessLogic();
			//bl.createData();
	        
			//bl.deletData();
		    bl.updateData();
			bl.readData();
			
			}

}