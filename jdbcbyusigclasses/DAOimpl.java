package com.xworkz.xworkzapp.jdbcbyusigclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOimpl implements NewsChannelDAO {
	
	@Override
	public void save(NewsChannelDTO dto) throws ClassNotFoundException, SQLException {
		System.out.println(dto);
		Class.forName(Dbc.driver);
		Connection connection=null;
		try {
		connection = DriverManager.getConnection(Dbc.url,Dbc.user,Dbc.password);
		Statement statement = connection.createStatement();
		String sql="INSERT INTO news_table VALUES("+dto.getId()+",'"+dto.getName()+"','"+dto.getEditor()+"','"+dto.getOwner()+"','"+dto.getLang()+"')";
		statement.executeUpdate(sql);
		
		}
		finally {
			connection.close();
			System.out.println("connection closed");
			
		}
		

	}

	@Override
	public void update(String lang, String name) throws ClassNotFoundException, SQLException {
		System.out.println("sucessfully updated");
		Class.forName(Dbc.driver);
		Connection connection=null;
		try {
		connection = DriverManager.getConnection(Dbc.url,Dbc.user,Dbc.password);
		Statement statement = connection.createStatement();
		String sql="UPDATE news.news_table SET N_LANG='"+lang+"' WHERE N_NAME='"+name+"' ";
		int update = statement.executeUpdate(sql);
		System.out.println(update);
		
		}
		finally {
			connection.close();
			System.out.println("connection closed");
			
		}
		
		
	}

	@Override
	public void delete(String name) throws ClassNotFoundException,SQLException {
		System.out.println("sucessfully updated");
		Class.forName(Dbc.driver);
		Connection connection=null;
		try {
		connection = DriverManager.getConnection(Dbc.url,Dbc.user,Dbc.password);
		Statement statement = connection.createStatement();
		String sql="delete from news.news_table where N_NAME='"+name+"'";
		int update = statement.executeUpdate(sql);
		System.out.println(update);
		
		}
		finally {
			connection.close();
			System.out.println("connection closed");
			
		}
		
				
	}


}
