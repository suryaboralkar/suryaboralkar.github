package com.xworkz.xworkzapp.matrimony;

import java.sql.SQLException;

public class MatrimonyTester {

	public static void main(String[] args) throws SQLException {
           MatriDTO dto = new MatriDTO();
	
	dto.setId(4);
	dto.setMName("@@");
	dto.setMGender("FM");
	dto.setMQualities("active,punctual");
	dto.setMQualification("should be educated");
		MatriDAO impli = new DaoImpli();
		impli.save(dto);
		
     
	}

}
