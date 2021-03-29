package com.xworkz.xworkzapp.crud.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class BagDaoImpl implements BagDao {
             LinkedList<BagDto> bdto=  new LinkedList<BagDto>();
	@Override
	public void add(BagDto dto) {
            bdto.push(dto);
            
           
	}

	@Override
	public void display() {
           Iterator iterator=bdto.iterator();
           
           while(iterator.hasNext())
           {
        	   BagDto data=(BagDto)iterator.next();
        	   System.out.println("*****************************************");
        	   System.out.println("brand name of the bag is:"+" "+ data.getBrandName());
        	   System.out.println("number of zips are:"+" "+ data.getNoOfZips());
        	   System.out.println("capacity of the bag is:" +" "+ data.getCapacity());
        	   System.out.println("price of the bag is:"   +" "+ data.getPrice());
        	   System.out.println("*****************************************");

           }
	}

	

	@Override
	public void remove(BagDto dto) {
      bdto.pop();
	}

}
