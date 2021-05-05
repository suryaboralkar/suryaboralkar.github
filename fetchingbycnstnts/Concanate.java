package fetchingbycnstnts;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Concanate {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(Db.driver);
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Db.url, Db.user, Db.password);
			Statement statement = connection.createStatement();
			double length=500;
			double length1=1200;
			String sql = "select * from river where R_LENGTH> "+length+" and R_LENGTH<"+length1+" ";
			ResultSet set = statement.executeQuery(sql);

			while (set.next()) {

				int id = set.getInt(1);
				System.out.println("R_id is:" + id);
				String name = set.getString(2);
				System.out.println("R_name is:" + name);
				String origin = set.getString(3);
				System.out.println("R_origin is:" + origin);
				int dlength = set.getInt(4);
				System.out.println("lengt is:" + dlength);
				boolean b = set.getBoolean(5);
				System.out.println("polluted=" + b);
				BigDecimal dam = set.getBigDecimal(6);
				System.out.println("no of dams =" + dam);

				System.out.println("********************************");

			}
		} finally {
			connection.close();
			System.out.println("connection is closed");
		}
	}

}
