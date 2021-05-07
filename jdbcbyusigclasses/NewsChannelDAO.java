package com.xworkz.xworkzapp.jdbcbyusigclasses;

import java.sql.SQLException;

public interface NewsChannelDAO {
public void save(NewsChannelDTO dto) throws ClassNotFoundException,SQLException;

public void update(String lang,String name) throws ClassNotFoundException,SQLException;
public void delete(String name) throws ClassNotFoundException,SQLException;
}
