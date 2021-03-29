package com.xworkz.xworkzapp.crud.linkedlist;

import com.xworkz.xworkzapp.crud.linkedlist.customizeexception.InvalidBrandName;
import com.xworkz.xworkzapp.crud.linkedlist.customizeexception.InvalidCapacity;
import com.xworkz.xworkzapp.crud.linkedlist.customizeexception.InvalidNoOfZips;
import com.xworkz.xworkzapp.crud.linkedlist.customizeexception.InvalidPrice;

public class BagServiceImpl implements BagService {
       BagDao dao=new BagDaoImpl();
	@Override
	public void validate(BagDto dto) {
		boolean validate=true;
		
		try {
			if(!dto.getBrandName().startsWith("S")) {
				    validate=true;
				    throw new InvalidBrandName("please enter valid brandname");
			}
			if(dto.getCapacity()<2)
			{
				validate=true;
				throw new InvalidCapacity("please enter the valid capacity");
			}
			if(dto.getNoOfZips()<2)
			{
				validate=true;
				throw new InvalidNoOfZips("enter the valid zips");
				
			}
			if(dto.getPrice()<999)
			{
				validate=true;
				throw new InvalidPrice("enter the valid price");
			}
			  if(validate)
	           {
	        	   dao.add(dto);
	        	   dao.display();
	           }
		} catch (InvalidBrandName e) {
			System.out.println("invalid brand name");
		}catch (InvalidCapacity e) {
              System.out.println("invalid capacity");		}
		
		catch (InvalidPrice e) {
			System.out.println("invalid price");
		}
		catch (InvalidNoOfZips e) {
			System.out.println("invalid zips");
		}
         
			
      		
	}
   

}
