package com.xworkz.xworkzapp.crud.linkedlist;

public class BagUtil {
	public static void main(String[] args) {
		BagDto bagDto = new BagDto("Skybag", 999, 3, 3);
         System.out.println("program starts");
		BagServiceImpl simpl=new BagServiceImpl();
		simpl.validate(bagDto);
		System.out.println("program ends");
		
	}

}
