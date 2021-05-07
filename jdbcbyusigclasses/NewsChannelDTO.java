package com.xworkz.xworkzapp.jdbcbyusigclasses;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NewsChannelDTO {
	private int id;
	private String name;
	private String owner;
	private String editor;
	private String lang;

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof NewsChannelDTO) {
			NewsChannelDTO cast = (NewsChannelDTO) obj;
			if (cast.getName().equals(this.name)) {
				return true;
			} 
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 25;
	}
	

}
