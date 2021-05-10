package com.xworkz.xworkzapp.matrimony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImpli implements MatriDAO{
	String url="jdbc:mysql://localhost:3306/customer";
	String user="root";
	String password="root";
	
    MatriDTO dto = new MatriDTO();
	@Override
	public void save(MatriDTO dto) throws SQLException {
		Connection connection=null;
		try {
			
		
		 connection = DriverManager.getConnection(url,user,password);
		String sql="INSERT INTO matrimonytable VALUES (?,?,?,?,?)";
		 PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getMName());
		statement.setString(3, dto.getMGender());
		statement.setString(4, dto.getMQualities());
		statement.setString(5, dto.getMQualification());
		
		boolean execute = statement.execute();
		System.out.println("execute"+false);
		
		}finally
		{
			connection.close();
		}
		
		
	}


	
	

}
