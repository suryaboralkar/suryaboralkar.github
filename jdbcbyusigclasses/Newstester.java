package com.xworkz.xworkzapp.jdbcbyusigclasses;

import java.sql.SQLException;

public class Newstester {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		NewsChannelDTO dto = new NewsChannelDTO();
		
		NewsChannelDAO dao = new DAOimpl();
		//dao.save(dto);
		//dao.update("kannada","aajtak");
		dao.delete("tv9");
	}

}
